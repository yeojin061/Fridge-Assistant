// TensorFlow Lite 모델을 사용하여 이미지를 분류하는 메서드
public void classifyImage(Bitmap image) {
    try {
        // TensorFlow Lite 모델 불러오기
        ModelFood model = ModelFood.newInstance(context);

        // 입력 데이터 생성
        TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 64, 64, 3}, DataType.FLOAT32);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4 * imageSize * imageSize * 3);
        byteBuffer.order(ByteOrder.nativeOrder());

        // Bitmap 이미지를 ByteBuffer로 변환
        int[] intValues = new int[imageSize * imageSize];
        image.getPixels(intValues, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        int pixel = 0;
        for (int i = 0; i < imageSize; i++) {
            for (int j = 0; j < imageSize; j++) {
                int val = intValues[pixel++];
                byteBuffer.putFloat(((val >> 16) & 0xFF) * (1.f / 255.f)); // R
                byteBuffer.putFloat(((val >> 8) & 0xFF) * (1.f / 255.f));  // G
                byteBuffer.putFloat((val & 0xFF) * (1.f / 255.f));         // B
            }
        }
        inputFeature0.loadBuffer(byteBuffer);

        // 모델 실행 및 결과 얻기
        ModelFood.Outputs outputs = model.process(inputFeature0);
        TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();
        float[] confidences = outputFeature0.getFloatArray();

        // 가장 높은 확률의 클래스 선택
        int maxPos = 0;
        float maxConfidence = 0;
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i] > maxConfidence) {
                maxConfidence = confidences[i];
                maxPos = i;
            }
        }

        // 클래스 목록
        String[] classes = {"계란", "고구마", "깻잎", "당근", "대파", "두부", "마늘", "바나나", "새송이 버섯",
                            "아보카도", "애호박", "양상추", "양파", "오이", "우유", "콩나물", "토마토", "파프리카", "팽이버섯"};

        // 결과 출력
        result.setText(classes[maxPos]);

        // 모델 자원 해제
        model.close();
    } catch (IOException e) {
        // 예외 처리
        e.printStackTrace();
    }
}

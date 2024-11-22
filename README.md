# Fridge-Assistant
냉장고 속 식재료 관리 및 메뉴 추천 어시스턴트

## Overview
This repository contains the code I personally contributed to during the development of the Fridge-Assistant project.
본 리포지토리는 '냉장고 속 식재료 관리 및 메뉴 추천 어시스턴트' 프로젝트에서 제가 기여한 코드만 포함하고 있습니다.

Fridge-Assistant is an assistant application that allows users to record ingredients, manage expiration dates, and receive menu recommendations.
냉장고 속 재료를 기록하고, 유통기한을 관리하며, 추천 메뉴를 제공하는 어시스턴트 애플리케이션입니다.

## My Contributions
1. Crawling and preprocessing ingredient images.
재료 이미지 크롤링 및 데이터 전처리
2. Training a TensorFlow model for food image recognition.
음식 이미지 인식을 위한 TensorFlow 모델 학습
3. Integrating TensorFlow Lite with Android Studio for mobile deployment.
TensorFlow Lite를 Android Studio와 연동하여 배포

## Notes
This repository includes only my contributions. Full project implementation, including UI and database integration, is not included here.
이 리포지토리에는 제 기여만 포함되어 있습니다. UI 및 데이터베이스 통합을 포함한 전체 프로젝트 구현은 여기에 포함되지 않습니다.
Due to data dependency issues, the code is not executable as is.
데이터 의존성 문제로 인해 현재 상태로는 실행이 불가능합니다.

# Project Structure

## Folder Structure
- /data_preprocessing/preprocess.py: Code for loading and preprocessing data. 데이터를 로드하고 전처리하는 코드를 포함합니다.
- /model/model_definition.py: Code for defining the TensorFlow model. TensorFlow 모델을 정의하는 코드를 포함합니다.
- /model/model_training.py: Code for training the model. 모델을 학습시키는 코드를 포함합니다.
- /evaluation/evaluate_model.py: Code for evaluating the model. 모델을 평가하는 코드를 포함합니다.
- /visualization/visualize_results.py: Code for visualizing predictions. 예측 결과를 시각화하는 코드를 포함합니다.
- /android-integration/classify_image.java : Code for integrating TensorFlow Lite in Android Studio. Android Studio에서 TensorFlow Lite를 연동하는 코드를 포함합니다.

## How to Use
1. Preprocess data using data_preprocessing/preprocess.py. 해당 코드를 사용하여 데이터를 전처리합니다.
2. Define the model using model/model_definition.py. 해당 코드를 사용하여 모델을 정의합니다
3. Train the model using model/model_training.py. 해당 코드를 사용하여 모델을 학습합니다.
4. Evaluate the model using evaluation/evaluate_model.py. 해당 코드를 사용하여 모델을 평가합니다.
5. Visualize results using visualization/visualize_results.py. 해당 코드를 사용하여 결과를 시각화합니다.
6. Integrate the model using android-integration/classify_image.java. 해당 코드를 사용하여 Android 애플리케이션에 모델을 통합합니다.

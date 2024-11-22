import numpy as np

def load_and_preprocess_data(file_path, train_ratio=0.7):
    food = np.load(file_path)
    np.random.shuffle(food)
    row = food.shape[0]
    train_num = int(row * train_ratio)
    x_train = food[:train_num, :12288].reshape(-1, 64, 64, 3).astype('float32') / 255.0
    x_test = food[train_num:, :12288].reshape(-1, 64, 64, 3).astype('float32') / 255.0
    y_train = food[:train_num, 12288:]
    y_test = food[train_num:, 12288:]
    return x_train, x_test, y_train, y_test

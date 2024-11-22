from tensorflow.keras.models import Sequential

def train_model(model, x_train, y_train, x_test, y_test, batch_size=512, epochs=10):
    history = model.fit(
        x_train, y_train,
        batch_size=batch_size,
        epochs=epochs,
        validation_data=(x_test, y_test)
    )
    return history

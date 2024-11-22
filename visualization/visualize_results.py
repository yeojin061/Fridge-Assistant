import matplotlib.pyplot as plt
import random

def visualize_predictions(x_test, y_test, food_list):
    random_idxs = random.sample(range(len(x_test)), 10)
    fig = plt.figure()
    for i, idx in enumerate(random_idxs):
        subplot = fig.add_subplot(2, 5, i + 1)
        subplot.set_xticks([])
        subplot.set_yticks([])
        subplot.set_title(food_list[np.argmax(y_test[idx])])
        subplot.imshow(x_test[idx])
    plt.show()

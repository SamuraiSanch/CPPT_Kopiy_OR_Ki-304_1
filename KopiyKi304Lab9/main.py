from Tree import Tree

# main program
if __name__ == "__main__":
    #об'єкт на основі класу Дерево
    tree = Tree()
    #використання методів класу за допомогою створеного вище об'єкта
    tree.showYear()
    tree.showStatus()
    for i in range(20):
        tree.skipYear()
    tree.showYear()
    tree.showStatus()
    tree.printTaste()
    tree.giveAnotherTaste("Bitter")
    tree.printTaste()
    tree.printHeight()
    tree.addHeight()
    tree.printHeight()
    tree.subHeight()
    tree.printHeight()
    tree.changeAdjustment("Like water")
    tree.changeTone("Black")
    tree.checkWater()
    tree.setSummer()
    tree.checkWater()
    tree.giveWater()
    tree.checkWater()
    tree.bloom()
    tree.checkType()

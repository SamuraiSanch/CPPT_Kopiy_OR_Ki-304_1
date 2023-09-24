from Plant import Plant
#class Tree
class Tree(Plant):
    def __init__(self):
        super().__init__()
        self.__needWater = False
        self.type = "Conifer"
    def setSummer(self):
        print("Summer came and the tree dried up.")
        self.__needWater = True
    def checkWater(self):
        print("A tree needs water: " + str(self.__needWater))
    def bloom(self):
        print("The tree is blooming. What a beauty!")
    def giveWater(self):
        print("You watered the tree! Now it does not need water.")
        self.__needWater = False
    def checkType(self):
        print("Type of the tree: " + self.type)

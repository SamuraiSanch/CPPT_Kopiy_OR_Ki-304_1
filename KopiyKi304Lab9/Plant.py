from Appearance import Appearance
from Adaptation import Adaptation
from Specifics import Specifics

#class Plant
class Plant:
    def __init__(self):
        self.__specific = Specifics()
        self.__appearance = Appearance()
        self.__adaptation = Adaptation()
    def skipYear(self):
        print("Skip 1 year...")
        self.__specific.skip()
        if self.__specific.getTime()<=0:
            self.__specific.isDead()
            print("Plant is dead.")
    def showYear(self):
        print("Time to plant death: " + str(self.__specific.getTime()) + " Years.")
    def showStatus(self):
        print("Plant alive: " +str(self.__specific.getStatus()))
    def printTaste(self):
        print("Plant taste: " + self.__specific.getTaste())
    def giveAnotherTaste(self,s_taste):
        print("Setting another taste...")
        self.__specific.setTaste(s_taste)
    def addHeight(self):
        print("Calls addHeight...")
        a = self.__appearance.getHeight()
        a = a+1
        self.__appearance.setHeight(a)
    def subHeight(self):
        print("Calls subHeight...")
        a = self.__appearance.getHeight()
        a = a-1
        self.__appearance.setHeight(a)
    def printHeight(self):
        print("Height: " + str(self.__appearance.getHeight()))
    def changeAdjustment(self,a_adjustment):
        print("Setting new adjustment: " + a_adjustment)
        self.__adaptation.setAdjustment(a_adjustment)
    def changeTone(self,s):
        self.__appearance.setTone(s)
        print("Changing tone to: " + s)


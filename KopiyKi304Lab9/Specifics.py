#class Specipics
class Specifics:
    #Constructor
    def __init__(self):
        self.__time = 20
        self.__taste = "Sweet"
        self.__alive = True
    def isDead(self):
        self.__alive = False
    def getStatus(self):
        return self.__alive
    def getTaste(self):
        return self.__taste
    def setTaste(self,newTaste):
        self.__taste = newTaste
    def skip(self):
        self.__time = self.__time-1
    def getTime(self):
        return self.__time

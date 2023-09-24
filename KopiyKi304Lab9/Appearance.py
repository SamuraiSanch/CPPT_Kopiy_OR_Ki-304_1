#class Appearance
class Appearance:
    def __init__(self):
        self.__color = "Blue"
        self.__height = 12.5
        self.__tone = "White"
        self.__form = "Direct"
    def setHeight(self,h_height):
        self.__height = h_height
    def getHeight(self):
        return self.__height
    def setTone(self,s_tone):
        self.__tone = s_tone

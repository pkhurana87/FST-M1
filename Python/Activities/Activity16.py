class car:

    def __init__(self, manufacturer, model, make, transmission, color ):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print (self.manufacturer + " "+ self.model + " " +"is moving")
    def stop(self):
        print (self.manufacturer + " "+ self.model + " "+"is stopped")

	
c1 = car("AB", "Model A","2020","Electric","white" )

c1.accelerate()
c1.stop()

c2 = car("ABc", "Model B","2021","Electric2","black" )

c2.accelerate()
c2.stop()

c3 = car("ABcd", "Model C","2019","Electric3","red" )
c3.accelerate()
c3.stop()


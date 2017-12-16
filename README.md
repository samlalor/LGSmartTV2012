# LGSmartTV2012
A Device Handler to connect 2012-2013 LG Smart TV's to Smart Things

This is based on a similar project that connects Smartthings to Pre 2012 LG Smart TVs.

Reference:
https://github.com/dan06/SmartThings-LG-Smart-TV

Allows you to connect your LG Smart TV to Smartthings, use some basic controls and power off the TV through commands such as Alexa/ActionTiles/Home Assistant etc. At the minute the only control you can use through these apps is power off.

Simply add the Device Discovery Smart App and Device Handler to your IDE and follow the instructions. You LG Smart TV must be powered on and allowing remote control.

This will NOT turn the on as it sends XML Packages to the TV over the network and it wont respons to these packages when powered off.

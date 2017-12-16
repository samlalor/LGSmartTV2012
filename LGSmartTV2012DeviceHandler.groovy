/**
 *  LG Smart TV Device Type
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "LG Smart TV 2012+", namespace: "samlalor", author: "Sam Lalor") 
    {
		capability "TV"
      	capability "Music Player"
        capability "Refresh"
        capability "Switch"
        
        attribute "sessionId", "string"    
        
        command "refresh"
        command "externalInput"
        command "back"
        command "up"
        command "down"
        command "left"
        command "right"
        command "myApps"
        command "ok"
        command "home"
	}
    
    preferences {
        input("televisionIp", "string", title:"Television IP Address", description: "Television's IP address", required: true, displayDuringSetup: false)
        input("pairingKey", "string", title:"Pairing Key", description: "Pairing key", required: true, displayDuringSetup: false)
	}

	simulator 
    {
		// TODO: define status and reply messages here
	}

	tiles()
    {
    	
    	standardTile("power", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:"Power Off", icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/power.png", action:"Switch.off"
        }
        standardTile("mute", "device.mute", inactiveLabel:false, decoration:"flat") {
            state "default", label:"Mute", icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/mute.png", action:"Music Player.mute"
        }
        standardTile("volumeUp", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Volume Up', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/volumeup.png", action:"TV.volumeUp"
        }
        standardTile("volumeDown", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Volume Down', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/volumedown.png", action:"TV.volumeDown"
        }
        standardTile("channelUp", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Channel Up', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/channelup.png", action:"TV.channelUp"
        }
        standardTile("channelDown", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Channel Down', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/channeldown.png", action:"TV.channelDown"
        }
         standardTile("back", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Back', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/back.png", action:"back"
        }
        standardTile("externalInput", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Source', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/hdmi.png", action:"externalInput"
        }
        standardTile("up", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Up', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/up.png", action:"up"
        }
        standardTile("left", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Left', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/left.png", action:"left"
        }
        standardTile("down", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'down', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/down.png", action:"down"
        }
        standardTile("right", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'right', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/right.png", action:"right"
        }
        standardTile("myApps", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'My Apps', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/apps.png", action:"myApps"
        }
        standardTile("ok", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Ok', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/ok.png;", action:"ok"
        } 
        standardTile("home", "device.status", inactiveLabel:false, decoration:"flat") {
            state "default", label:'Home', icon:"https://raw.githubusercontent.com/samlalor/LGSmartTV2012/Icons/home.png", action:"home"
        }
        
        main (["power"])
        
		details(["power","externalInput", "home", "mute","back","myApps", "volumeUp", "up", "channelUp", "left", "ok", "right", "volumeDown", "down", "channelDown"])
        
        
	}
    
}

def installed()
{

}

// parse events into attributes
def parse(String description) 
{
	log.debug "Parsing '${description}'"
    
    if (description == "updated") 
    {
    	sendEvent(name:'refresh', displayed:false)
    }
    else
    {
    	parseHttpResult(description)
    }
}

def on()
{
	log.debug "Executing 'Power Toggle'"
	return sendCommand(1)
    sendEvent(name: "switch", value: "On")
}

def off()
{
	log.debug "Executing 'Power Toggle'"
	return sendCommand(1)
    sendEvent(name: "switch", value: "Off")
}

def channelUp() 
{
	log.debug "Executing 'channelUp'"
	return sendCommand(27)
}

def channelDown() 
{
	log.debug "Executing 'channelDown'"
	return sendCommand(28)
}


// handle commands
def volumeUp() 
{
	log.debug "Executing 'volumeUp'"
	return sendCommand(24)
}

def volumeDown() 
{
	log.debug "Executing 'volumeDown'"
	return sendCommand(25)
}


def refresh() 
{
    log.debug "Executing 'refresh'"
    return sessionIdCommand()
}

def mute() 
{
	log.debug "Executing 'mute'"   
    return sendCommand(26)
}

def externalInput()
{
	return sendCommand(47)
}

def back()
{
	return sendCommand(23)
}

def up()
{
	return sendCommand(12)
}

def down()
{
	return sendCommand(13)
}

def left()
{
	return sendCommand(14)
}

def right()
{
	return sendCommand(15)
}

def myApps()
{
	return sendCommand(417)
}

def ok()
{
	return sendCommand(20)
}

def home()
{
	return sendCommand(21)
}


def sendCommand(cmd)
{
	def actions = []
    
   	actions << sessionIdCommand()
   	actions << tvCommand(cmd)
   
    actions = actions.flatten()
    return actions
    
}

def sessionIdCommand()
{
    def commandText = "<?xml version=\"1.0\" encoding=\"utf-8\"?><auth><type>AuthReq</type><value>$pairingKey</value></auth>"       
    def httpRequest = [
      	method:		"POST",
        path: 		"/roap/api/auth",
        body:		"$commandText",
        headers:	[
        				HOST:			"$televisionIp:8080",
                        "Content-Type":	"application/atom+xml",
                    ]
	]
    
    try 
    {
    	def hubAction = new physicalgraph.device.HubAction(httpRequest)
        log.debug "hub action: $hubAction"
        return hubAction
    }
    catch (Exception e) 
    {
		log.debug "Hit Exception $e on $hubAction"
	}
}

def tvCommand(cmd)
{
    def commandText = "<?xml version=\"1.0\" encoding=\"utf-8\"?><command><type>HandleKeyInput</type><value>${cmd}</value></command>"

    def httpRequest = [
      	method:		"POST",
        path: 		"/udap/api/command",
        body:		"$commandText",
        headers:	[
        				HOST:			"$televisionIp:8080",
                        "Content-Type":	"application/atom+xml",
                    ]
	]
    
    try 
    {
    	def hubAction = new physicalgraph.device.HubAction(httpRequest)
        log.debug "hub action: $hubAction"
    	return hubAction
    }
    catch (Exception e) 
    {
		log.debug "Hit Exception $e on $hubAction"
	}
}



def appCommand()
{
	log.debug "Reached App Command"
    def commandText = "<?xml version=\"1.0\" encoding=\"utf-8\"?><envelope><api type=\"command\"><name>AppExecute</name><auid>1</auid><appname>Netflix</appname><contentId>1</contentId></api></envelope>"

    def httpRequest = [
      	method:		"POST",
        path: 		"/udap/api/command",
        body:		"$commandText",
        headers:	[
        				HOST:			"$televisionIp:8080",
                        "Content-Type":	"application/atom+xml",
                    ]
	]
    
    try 
    {
    	def hubAction = new physicalgraph.device.HubAction(httpRequest)
        log.debug "hub action: $hubAction"
    	return hubAction
    }
    catch (Exception e) 
    {
		log.debug "Hit Exception $e on $hubAction"
	}
}

private parseHttpResult (output)
{
	def headers = ""
	def parsedHeaders = ""
    
    def msg = parseLanMessage(output)

    def headersAsString = msg.header // => headers as a string
    def headerMap = msg.headers      // => headers as a Map
    def body = msg.body              // => request body as a string
    def status = msg.status          // => http status code of the response
    def json = msg.json              // => any JSON included in response body, as a data structure of lists and maps
    def xml = msg.xml                // => any XML included in response body, as a document tree structure
    def data = msg.data              // => either JSON or XML in response body (whichever is specified by content-type header in response)

	log.debug "headers: $headerMap, status: $status, body: $body, data: $json"
  
    if (status == 200){
    	parseSessionId(body)
    }
    else if (status == 401){
    	log.debug "Unauthorized - clearing session value"
    	sendEvent(name:'sessionId', value:'', displayed:false)
        sendEvent(name:'refresh', displayed:false)
    }
}

def String parseSessionId(bodyString)
{
	def sessionId = ""
	def body = new XmlSlurper().parseText(bodyString)
  	sessionId = body.session.text()

	if (sessionId != null && sessionId != "")
  	{
  		sendEvent(name:'sessionId', value:sessionId, displayed:false)
  		log.debug "session id: $sessionId"
    }
}

private parseHttpHeaders(String headers) 
{
	def lines = headers.readLines()
	def status = lines[0].split()

	def result = [
	  protocol: status[0],
	  status: status[1].toInteger(),
	  reason: status[2]
	]

	if (result.status == 200) {
		log.debug "Authentication successful! : $status"
	}
    else
    {
    	log.debug "Authentication Unsuccessful: $status"
    }

	return result
}

private def delayHubAction(ms) 
{
    log.debug("delayHubAction(${ms})")
    return new physicalgraph.device.HubAction("delay ${ms}")
}

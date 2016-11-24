package br.com.trapp.deviceserver.echomodule;

import br.com.trapp.deviceserver.api.DeviceMessage;
import br.com.trapp.deviceserver.api.DeviceModule;

public class EchoModule implements DeviceModule {

    public DeviceMessage incomingMessage(DeviceMessage message) {
	switch (message.getMethod()) {
	case "echoreverse":
	    StringBuilder sb = new StringBuilder(message.getMessage());
	    sb.reverse();
	    message.setMessage(sb.toString());
	    break;
	}
	return message;
    }

    public String getName() {
	return "Echo Module";
    }

    public String getVersion() {
	return "1.0";
    }

    public String getIdendifier() {
	return "echo";
    }

}

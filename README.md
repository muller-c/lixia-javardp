# lixia-javardp
Automatically exported from code.google.com/p/lixia-javardp

<<<<<<< HEAD

This version is compatible JAVA 1.8 with intellij 2019.3 and maven
=======
With google code announcing its [retirement](http://google-opensource.blogspot.com/2015/03/farewell-to-google-code.html) I wanted to ensure that this project lived on.

The last commit from the original developer, [Zhou Peng](mailto:zhoupeng.hust@gmail.com), was Feb 25 2011. If [Zhou Peng](mailto:zhoupeng.hust@gmail.com) is reading this please contact me so I can transfer ownership back to you. 

##What is lixia-javardp?
_From the original developers [website](http://zhoupengylx.appspot.com)_

Seamless Java RDP client is a general Java RDP client for Windows Terminal Services with "seamless" feature. Which is built base on open sourec project properJavaRDP. The idea of "seamless" is come from rdesktop, which is a opensource RDP client on unix platform. "seamless" can make remote running application looks like running locally. I upgrad properJavaRDP code from AWT to Swing and add the functionality to handle "seamless" message in a special rdp vchannel. Recently, I also maed some upgrade to support Windows 2008/Windows7


###How do I use it?
* Grab the [latest binary](https://github.com/thshdw/lixia-javardp/releases).
* Place the binary in a directory ```~/Documents/rdp/``` for example.
* Create a script pointing to the directory calling lixia-javardp like this:
```
#!/bin/bash
cd /Users/thshdw/Documents/rdp/
java -jar lixia-javardp.jar -g 1152x648 192.162.1.50 -u YourDomain\\YourUserName -T 'Print Server' -l i
```
* Execute your script ```thshdw-mac-book:rdp tum$ sh mywebserver.command```

Options are:
```
This project is based on code from the Elusiva Everywhere project, which was based on rdesktop, and properJavaRDP.
For some history see... https://web.archive.org/web/20111120182133/http://www.elusiva.com/opensource
Version: lixia-javardp 2.1.0
Usage: java -jar lixia-javardp.jar [options]
	-b ......................... bandwidth saving (good for 56k modem, but higher latency
	-c DIR ..................... working directory
	-d DOMAIN .................. logon domain
	-D is dubug model
	-f[s] ...................... full-screen mode [s to enable seamless mode]
	-g WxH ..................... desktop geometry
	-m MAPFILE ................. keyboard mapping file for terminal server
	-l d,i,w,e,f ............. logging level {debug, info, warn, error, fatal}
	-n HOSTNAME ................ client hostname
	-p PASSWORD ................ password
	-s SHELL ................... shell
	-t NUM ..................... RDP port (default 3389)
	-T TITLE ................... -T 'Production WebServer''
	-u USERNAME ................ user name
	-o BPP ..................... bits-per-pixel for display
    -e path .................... path to load licence from (requests and saves licence from server if not found)
	-r device .................. enable specified device redirection (this flag can be repeated)
    --save_licence ............. request and save licence from server
    --load_licence ............. load licence from file
    --console .................. connect to console
	--debug_key ................ show scancodes sent for each keypress etc
	--debug_hex ................ show bytes sent and received
	--no_remap_hash ............ disable hash remapping
	--quiet_alt ................ enable quiet alt fix
	--no_encryption ............ disable encryption from client to server
	--use_rdp4 ................. use RDP version 4
    --enable_menu .............. enable menu bar
    --overHttp ................. http proxy server address and port(example--192.168.100.100:80)
	--log4j_config=FILE ........ use FILE for log4j configuration
	--bulk_compression ......... enable bulk compression
Example: java -jar lixia-javardp.jar 192.168.1.50 -g 1152x648 -u admin
```

###Compiling from source
* Install ant ```brew install ant```
* Download the source 
* From the source root directory run ```ant -buildfile build.xml```

###My involvement 
One of the nice things about lixia-javardp is the keyboard layout mapping. While on the remote server your keyboard layout will map. This is a god send if you use another keyboard layout like I do. I migrated the code base to github so the project would not be forgotten. I may try to fix a bug, and I have compiled the latest binary from source; something that was missing from google code. I doubt i'll be adding new features.
>>>>>>> parent of a527d4f... Merge pull request #1 from muller-c/maven

# hyCMD
hyCMD, also "HypixelUnknownCommand" is a plugin, that makes your chat's unknown command message look way better!
For newer versions like 1.21.4, there is no direct way to change your unknown chat message and you are stuck with
the usual boring <--[[HERE]] Unknown command message, which really just looks bad. Also if you are on lower versions
you still benefit from using this plugin, since you get the ('<cmdname>') at the end of the message like on hypixel,
giving extra style to your server!

### LICENSE
This project uses a **custom non-commercial license**. See [LICENSE](hyCMD/LICENSE) for details.

### MODIFY YOUR MESSAGE
There isn't any inbuilt configuration in this plugin, so you only have the hyCMD.jar file in your plugins folder,
no extra folders with configurations. If you still want to edit your message, you have to do so in the source
code.

## Plugin Information

### Comparison
Compare how this plugin changes your messages for "Unknown Command."

#### Default 1.21.4 Message:
Unknown Command
test123<---[HERE]
#### Default <1.12 Message:
Unknown Command. Type "help" for help.
#### hyCMD Message:
Unknown Command. Type "/help" for help. ('test123')

### Custom Examples:
Modify and create your own "Unknown Command" messages by downloading the source code and building it with Gradle: [Gradle Downloads](https://gradle.org/releases/).
Hint: You require JDK/Java 21 installed on your computer to use Gradle Building.

#### Example 1:
[Prefix] >> This command does not exist.
#### Example 2:
The command you entered is not available.
#### Example 3:
The command 'test123' is not valid.

### How to build your custom command message to a JAR:
#### Gradle 8 Binary:
Download: [Gradle 8 Bin](https://gradle.org/next-steps/?version=8.14.2&format=bin)
Put this to your C:\ Drive.

## Windows:

Open Command Prompt, and enter: 'java -version. It should say Java 21, if not, there are many setup toturials for it.
Then use 'cd <path_to_the_source_code>' example: cd C:\Users\<profile>\Downloads\hyCMD'
#### WARNING:
The file you change directory to has to be unzipped, and should contain build.gradle, src, settings.gradle.
#### Then modify:
hyCMD\src\main\fcm\fcmbyte\hyCMD\hyCommand.java and change the marked line to your text.
#### Finally go back to your terminal with Java 21 and enter:
"C:\(gradle unzipped folder)\bin\gradle.bat" clean build
After that in your folder of hyCMD you should see Builds\Libs and your jar in it. Take the one called hyCMD-1.0.0-LATEST.jar!

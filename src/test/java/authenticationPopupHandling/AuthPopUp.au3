#cs ----------------------------------------------------------------------------

	 AutoIt Version: 3.3.18.0
	 Author:         Krishna

	 Script Function:
		Handle Basic Authentication Popup

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here

; Wait for the authentication window (try different window titles)
WinWait("Sign in", "", 4)
If WinExists("Sign in") Then
    WinActivate("Sign in")
    Sleep(500)
    Send("admin")
    Send("{TAB}")
    Send("admin")
    Send("{ENTER}")
Else
    ; Try alternative window title
    WinWait("Authentication Required", "", 4)
    WinActivate("Authentication Required")
    Sleep(500)
    Send("admin")
    Send("{TAB}")
    Send("admin")
    Send("{ENTER}")
EndIf
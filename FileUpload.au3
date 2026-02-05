#cs ----------------------------------------------------------------------------

	 AutoIt Version: 3.3.18.0
	 Author:         myName

	 Script Function:
		Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here

; ---------- File Upload Using AutoIT ----------

; Wait for file dialog - try different possible titles
Local $hWnd = WinWait("[CLASS:#32770]", "", 10)

If $hWnd Then
    WinActivate($hWnd)
    Sleep(500)
    
    ; Set the file path in the filename field
    ControlSetText($hWnd, "", "Edit1", "C:\Users\krish\OneDrive\Desktop\CT20244538070_HackQuest10_Report.docx")
    
    Sleep(1000)
    
    ; Click the Open button
    ControlClick($hWnd, "", "Button1")
Else
    ; Try with "Open" title as backup
    WinWaitActive("Open", "", 5)
    ControlSetText("Open", "", "Edit1", "C:\Users\krish\OneDrive\Desktop\CT20244538070_HackQuest10_Report.docx")
    Sleep(1000)
    ControlClick("Open", "", "Button1")
EndIf

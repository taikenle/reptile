@echo off
echo Building ReptilePetManager.exe...

set "CSC=%SystemRoot%\Microsoft.NET\Framework64\v4.0.30319\csc.exe"
if not exist "%CSC%" set "CSC=%SystemRoot%\Microsoft.NET\Framework\v4.0.30319\csc.exe"

if not exist "%CSC%" (
    echo ERROR: csc.exe not found
    pause
    exit /b 1
)

del ReptilePetManager.exe 2>nul

"%CSC%" /out:ReptilePetManager.exe /target:exe launcher.cs

if exist ReptilePetManager.exe (
    echo SUCCESS: ReptilePetManager.exe created
) else (
    echo COMPILE FAILED
)
pause

const { app, BrowserWindow } = require('electron')
const path = require('path')

let mainWindow

function createWindow () {
  mainWindow = new BrowserWindow({
    width: 1500,
    height: 1300,
    webPreferences: {
      nodeIntegration: true
    }
  })

  const indexPath = path.join(__dirname, '..', 'dist', 'gestionale-lavanderia', 'index.html')
  mainWindow.loadFile(indexPath)

  // mainWindow.webContents.openDevTools()

  mainWindow.on('closed', function() {
    mainWindow = null
  })
}

app.on('ready', createWindow)

app.on('window-all-closed', function() {
  if (process.platform !== 'darwin') {
    app.quit()
  }
})

app.on('activate', function() {
  if (mainWindow === null) {
    createWindow()
  }
})
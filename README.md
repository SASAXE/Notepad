# 📝 Simple Notepad - Java Swing Application

A streamlined text editor built using Java Swing framework as part of an Advanced Programming Techniques assignment. This notepad application demonstrates core GUI programming concepts including menu systems, anonymous inner classes for event handling, file operations, and custom dialog boxes.

## 🌟 Features

- **File Operations**: New, Open, Save, and Exit functionality
- **Edit Menu Operations**: Cut, Copy, Paste functionality using built-in JTextArea methods
- **Help Menu**: About dialog displaying creator information and student ID
- **Text Editing**: Multi-line text area with scrollbar support
- **Format Menu**: Advanced font and color customization
  - Font selection with family, size, bold, and italic options
  - Color picker for text foreground color
- **Error Handling**: User-friendly "Oops!" messages for file operations
- **Compact Design**: Clean, minimalist 500x400 window interface

## 🖥️ User Interface

### Main Window
- **Title**: "Notepad"
- **Size**: 500x400 pixels
- **Layout**: Simple BorderLayout with text area filling the center
- **Scrolling**: Automatic scrollbars when content exceeds window size

### Menu Structure
1. **File Menu**: New, Open, Save, Exit
2. **Edit Menu**: Cut, Copy, Paste  
3. **Format Menu**: Choose Font, Choose Color
4. **Help Menu**: About

## 🛠️ Technology Stack

- **Language**: Java 8+
- **GUI Framework**: Java Swing
- **Event Handling**: Anonymous ActionListener inner classes
- **File I/O**: BufferedReader/BufferedWriter
- **Layout**: Default BorderLayout
- **Font System**: GraphicsEnvironment for system font detection

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, or Notepad)
- Command Line Interface (Terminal/Command Prompt)

## 🚀 Setup Instructions

### Step 1: Environment Setup
1. **Install Java JDK**:
   - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - Follow installation instructions for your operating system
   - Verify installation by running: `java -version` in terminal/command prompt

2. **Verify Java Compiler**:
   ```bash
   javac -version
   ```
   You should see the Java compiler version information.

### Step 2: Project Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/simple-notepad.git
   cd simple-notepad
   ```

2. **Or download and extract**:
   - Download the ZIP file from GitHub
   - Extract to your desired location
   - Navigate to the project directory

### Step 3: Compilation and Execution

#### Method 1: Using Command Line
```bash
# Navigate to the project directory
cd path/to/simple-notepad

# Compile the Java file
javac SimpleNotepad.java

# Run the application
java SimpleNotepad
```

#### Method 2: Using IDE
1. Import the `SimpleNotepad.java` file into your preferred IDE
2. Ensure the main class is set to `SimpleNotepad`
3. Run the application directly from the IDE
 

## 🎯 Usage Guide

### File Operations
1. **Create new document**: File → New (clears current text)
2. **Open existing file**: File → Open (shows file chooser dialog)
3. **Save document**: File → Save (shows save dialog, saves as any file type)
4. **Exit application**: File → Exit

### Text Editing
1. **Cut text**: Select text → Edit → Cut
2. **Copy text**: Select text → Edit → Copy  
3. **Paste text**: Position cursor → Edit → Paste

### Text Formatting
1. **Change font**: Format → Choose Font
   - Select font family from system fonts
   - Adjust size (1-72)
   - Toggle Bold and/or Italic
   - Click OK to apply
2. **Change text color**: Format → Choose Color (opens color picker)

### Help
- **About information**: Help → About (displays: "Sasanka\nID: s16800\nThis is my notepad!")



## 📝 Assumptions and Special Notes

### Assumptions Made
1. **Java Environment**: Assumes user has JDK 8+ installed with Swing support
2. **File System Access**: Application assumes read/write permissions to local file system
3. **Operating System**: Cross-platform compatible (Windows, macOS, Linux)
4. **File Format**: Supports any text file format (no extension restrictions)
5. **Font System**: Relies on system's available font families
6. **Single Instance**: Application runs as a single-window instance

### Special Notes

#### Assignment Compliance
This project specifically fulfills university assignment requirements:
- ✅ **Edit menu** with Cut, Copy, Paste functionality
- ✅ **Help menu** with About dialog containing student information (Sasanka, ID: s16800)
- ✅ **Optional Format features** implemented (Font and Color choosers)

#### Code Architecture
1. **Single Class Design**: Entire application contained in one `SimpleNotepad` class with main method
2. **Anonymous Inner Classes**: Uses anonymous ActionListener implementations for cleaner code
3. **Event-Driven Programming**: All user interactions handled through ActionListener events
4. **Minimal Dependencies**: Uses only standard Java Swing components

#### Memory Management
- Application stores text in JTextArea component memory
- No persistent storage except through explicit file save operations
- Memory usage scales with text content and system font loading

#### File Operations Behavior
- **Open**: Supports any file type, reads as text using BufferedReader
- **Save**: Saves using BufferedWriter, no automatic file extension adding
- **Error Handling**: Simple "Oops!" messages for I/O exceptions
- **File Encoding**: Uses system default character encoding

#### UI/UX Features
- **Compact Window**: 500x400 pixel window for lightweight feel
- **System Integration**: Uses system's available fonts via GraphicsEnvironment
- **Modal Dialogs**: Font chooser uses proper modal dialog
- **Color Persistence**: Selected colors remain until application restart

#### Font Chooser Implementation
- **Font Family**: Dropdown with all system-available fonts
- **Size Control**: Spinner with range 1-72 pixels
- **Style Options**: Independent Bold and Italic checkboxes
- **Real-time Preview**: Font changes apply immediately on OK click

## 🐛 Known Issues

1. **Large Files**: Performance may degrade with very large text files (>5MB due to single-pass reading)
2. **File Encoding**: Limited to system default encoding; special characters may display incorrectly
3. **Font Dialog**: Font preview not available before applying changes
4. **Error Messages**: Generic "Oops!" messages don't specify exact error types
5. **Unsaved Changes**: No warning when closing with unsaved changes

## 🔮 Future Enhancements

- [ ] Add keyboard shortcuts (Ctrl+N, Ctrl+O, Ctrl+S, etc.)
- [ ] Implement unsaved changes warning dialog
- [ ] Add font preview in font chooser dialog
- [ ] More detailed error messages for different exception types
- [ ] Recent files menu
- [ ] Find and Replace functionality
- [ ] Background color selection option


## 🏗️ Implementation Details

### Key Components Used
- `JFrame` - Main application window
- `JTextArea` - Text editing component  
- `JScrollPane` - Automatic scrolling for text area
- `JMenuBar`, `JMenu`, `JMenuItem` - Menu system
- `JFileChooser` - File selection dialogs
- `JColorChooser` - Color selection dialog
- `JDialog` - Custom font selection modal
- `JComboBox`, `JSpinner`, `JCheckBox` - Font chooser controls

## 📄 License

This project is created for educational purposes as part of a university assignment. Feel free to use and modify for learning purposes.

## 🙏 Acknowledgments

- Course Instructor: Anuradha Madhushani  
- Java Swing Documentation and Community
- Oracle Java Tutorials
- Assignment guidelines from Advanced Programming Techniques course

---
## 👨‍💻 Author

**Sasanka Hemakumara**
- Student ID: S16800
- Course: Advanced Programming Techniques
- Institution: University Of Colombo
  
**Ready to run!** No additional setup required - just compile and execute! 🚀

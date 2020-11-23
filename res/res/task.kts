import java.io.File
import java.io.FileFilter

val dir = File(".")
dir.listFiles(FileFilter { it.name.endsWith(".txt") })
    ?.forEach { it.delete() }
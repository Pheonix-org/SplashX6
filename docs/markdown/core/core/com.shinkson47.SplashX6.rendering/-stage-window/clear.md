//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering](../index.md)/[StageWindow](index.md)/[clear](clear.md)

# clear

[jvm]\
fun [clear](clear.md)()

Used as an alias for close / dispose, since there was no dispose method available to override. 

 upPost's and unHook's this window, performs 'onClose', and then calls super.clear to decompose the window.

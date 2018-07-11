package demo10.c10_1

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

@Target(AnnotationTarget.PROPERTY)
annotation class JsonName(val name:String)
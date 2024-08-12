file:///D:/scala/functional-programming/assignment7/22000356_2.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Ishan%20Maduranga/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 563
uri: file:///D:/scala/functional-programming/assignment7/22000356_2.scala
text:
```scala
import scala.io.StdIn.readLine

object calculateSquare{
    def getInputs() : List[Int] = {
        var inputList : List[Int] = List()
        var continue = true

        while(continue){
            val input = readLine("enter the numbers(empty enter for terminate ) : ")
            if (input.isEmpty()){
                continue = false
            }
            else{
                inputList = inputList :+ input
            }
        }
        inputList

    }

    def calculateSquare(args : List[Int]) : List[Int] = {
        args.m@@
    }
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	scala.meta.internal.pc.completions.CaseKeywordCompletion$.scala$meta$internal$pc$completions$CaseKeywordCompletion$$$sortSubclasses(MatchCaseCompletions.scala:331)
	scala.meta.internal.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:279)
	scala.meta.internal.pc.completions.Completions.advancedCompletions(Completions.scala:388)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:184)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:89)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:155)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Ishan%20Maduranga/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala
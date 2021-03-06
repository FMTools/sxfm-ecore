# SXFM Ecore Model
Eclipse plugins for the SXFM Ecore Model

### What is this ?

SXFM is the Simple XML Format for Feature Models. It was created by Marcilio Mendonca for the [SPLOT (SPL Online Tools) research project](http://www.splot-research.org).
 
**The SXFM Ecore Model plugins** offer a meta-models and an editor to represent SXFM feature models in Eclipse. It does not provide means to load ``.sxfm`` files. Instead, they provide meta-classes for each concept in the model.

* The [SXFM file format](http://gsd.uwaterloo.ca:8088/SPLOT/sxfm.html) is documented in the SPLOT website.  
* The original [SXFM Ecore Model plugins](http://mauricioalferez.com/) were created by Mauricio Alferez. It can be downloaded [here](http://gsd.uwaterloo.ca:8088/SPLOT/sxfm-ecore.zip).
* This project is a maven-based version of these plugins.  

### Usage

You can install the plugins using the provided update site.

* Eclipse Juno or superior (It have been debugged in Eclipse Luna)

Also, you can use the meta-model classes in a Java Maven project using the following dependency declaration:

```xml
<dependency>
    <groupId>sxfm</groupId>
	<artifactId>sxfm</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.common</artifactId>
    <version>2.9.2-v20131212-0545</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore</artifactId>
    <version>2.9.2-v20131212-0545</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore.xmi</artifactId>
    <version>2.9.1-v20131212-0545</version>
</dependency>
```

If you are not using Maven, you can use the meta-model classes by downloading the .jar library from the releases page in Github. In addition, you must download and include in your projects the following libraries:

* [Eclipse EMF Common](http://repo1.maven.org/maven2/org/eclipse/emf/org.eclipse.emf.common/), org.eclipse.emf.common-2.9.2-v20131212-0545
* [Eclipse Ecore Common](http://repo1.maven.org/maven2//org/eclipse/emf/org.eclipse.emf.ecore/), org.eclipse.emf.ecore-2.9.2-v20131212-0545
* [Eclipse Ecore XMI](http://repo1.maven.org/maven2//org/eclipse/emf/org.eclipse.emf.ecore.xmi/), org.eclipse.emf.ecore.xmi-2.9.1-v20131212-0545
* [SPLAR](https://github.com/ticsw/splar/releases/tag/1.0), version 1.0
* [JavaBDD](http://javabdd.sourceforge.net/), version 2.10
* [Sat4j](http://www.sat4j.org/), version 2.0.4
* [jgrapht-core](http://jgrapht.org/), version 0.9.0
* [org.json](https://github.com/douglascrockford/JSON-java), version 20141113
* [opencsv](http://opencsv.sourceforge.net/), version 2.4

### Maven building

In order to use the meta-model classes in your Maven projects, you must build and install the plugins in your local maven repository. These tasks must be performed using the maven tools (in the command line or in your favorite IDE)

Using command line:
```
    $ mvn install
```
Using the [Eclipse m2e plugin](http://eclipse.org/m2e/):

1. Select the ``sxfm-ecore`` project in your workspace
2. Execute "Run As > Maven install"


### Differences with the original

* **Maven-based build**: In contrast to the original plugins, this project is build using [Maven](http://maven.apache.org/) and [Eclipse Tycho](https://eclipse.org/tycho/).
* **Includes a Feature and an Update Site**: It generates an update site that can be used to install the plugins using the "Help > Install New Software" and "Help > Eclipse Marketplace" options.  

### TODO

Right now, the plugin dependencies are managed by Tycho. The mechanism works well to compile the plugins in Eclipse but does not work to use the libraries in non-Eclipse environments (such as the web). Maven outside Eclipse cannot detect and download that dependencies. That is the reason to include manually the Eclipse dependencies in the above example. We are planning to use the Apache Felix plugins to manage the dependencies in a way that works both in Eclipse and in Maven. 

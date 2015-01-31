# Notes for the SXFM Ecore Model Plugins

### Project folders / structure

The SXFM Ecore repository is organized in multiple folders and maven projects:

    sxfm-ecore              -- root
      /plugins              -- Eclipse plugin projects
         /sxfm              -- metamodel for sxfm 
         /sxfm.edit         -- API to edit sxfm models 
         /sxfm.editor       -- tree-based editor for sxfm models
      /features             -- Eclipse features				
         /sxfm.feature      -- feature to be installed
      /releng               -- release projects
         /sxfm.updatesite   -- eclipse update site


### Build instructions

In order to build the plugins, you can use the traditional Eclipse options and/or Maven.  


Using maven
    
    $ cd sxfm-ecore
    $ mvn install 

### Options for Maven Tycho

Maven/Tycho configuration for all the projects are located in the ``pom.xml`` file at the root (the sxfm-ecore folder). There are some configuration that may be changed depending on the intended platforms.

 **Tycho version:** In order to use Tycho with the Maven 3.1, it is necessary to use maven-tycho-plugin with version 0.18.1 or superior. The version is defined in the ``tycho.version`` property.

* To use the last version: ``<tycho.version>0.20.0</tycho.version>``
* To use the 0.18.1 version: ``<tycho.version>0.18.1</tycho.version>``
 
 **Eclipse repository:** Plugin dependencies are obtained from the [Eclipse.org](http://www.eclipse.org) website. 
 The``eclipse-repo.url`` property defines the URL where the dependencies will be obtained.
 
* For the Luna-based dependencies: ``<eclipse-repo.url>http://download.eclipse.org/releases/luna</eclipse-repo.url>``
* For the Juno-based dependencies: ``<eclipse-repo.url>http://download.eclipse.org/releases/juno/</eclipse-repo.url>``		

JC=javac
.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin
DOCDIR=doc

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JC) -d $(BINDIR)/ -cp $(SRCDIR) $<

CLASSES=PowerBSTApp.class BSTNode.class BST.class DateExtract.class PowerAVLApp.class AVLNode.class AVLTree.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class

javadoc:
	javadoc  -classpath ${BINDIR} -d ${DOCDIR} ${SRCDIR}/*.java

# Erweitere Latex-Vorlage

Dies ist eine erweitere LaTeX Vorlage für die Hochschule Furtwangen.
Sie basiert auf der Vorlage von Fabian Berner.
Die Originalversion kann unter folgender Adresse abgerufen werden:
http://webuser.hs-furtwangen.de/~berner/wa.html


## Funktionen:

+ Quellcodeverzeichnis
+ Veränderte Verzeichnis-Struktur
+ Dateistruktur beginnend mit Zahlen zur Sortierung des Quellcodes
+ Abgeänderte Nummerierung im Inhaltsverzeichnis
+ Gitignore für LaTeX und TMP-Ordner
+ Vorbereitung zum Einsatz in [Texlipse](http://texlipse.sourceforge.net/)
+ Angepasste Code-Darstellung

## LaTeX Pakete:

### Linux 

texlive-Repository hinzufügen:

```sudo add-apt-repository -y ppa:texlive-backports/ppa```

Benötigte Pakete (können mit apt-get installiert werden):

+ texlive-full

oder einzeln:

+ texlive
+ latexmk
+ texlive-lang-german
+ texlive-latex-extra
+ texlive-fonts-extra
+ texlive-bibtex-extra

### Windows:

[Miktex](http://miktex.org/download)
Fehlende LaTeX pakete werden bei bedarf installiert.

### OSX: 
[Mactex](http://tug.org/mactex/)


Über Ergänzungen in Form eines Pull-Requests freue ich mich.

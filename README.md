# ♨ TP7 Java - Multithreading

Programme exécutable via la ligne de commande permettant de générer un nombre de classes de manière séquentielle et de manière multithreadé. Les temps d'éxécutions moyens sont ensuite affiché pour chacun des types d'éxécution afin de comparer la rapidité des méthodes.

## ✨ Installation
Télécharger le projet ou cloner le dépôt en local.
Il suffit ensuite de l'importer dans IntelliJ ou d'ouvrir un terminal pour l'utiliser.

## 🚀 Utilisation
### Lancement du programme
Il faut compiler le projet puis l'éxécuter à l'aide de l'interface graphique d'IntelliJ.
Dans un terminal, à l'intérieur du projet, taper la commande suivante pour afficher la comparaison des temps d'éxécution séquentielle et multithreadée :
```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /mnt/c/Users/axrem/Documents/ZZ3/Java/TP7/out/production/TP7 Main
```


## 📝 Détails sur le programme
### Utilité des classes
**Main.java** : lance le programme et éxécute la génération de manière séquentielle puis multithreadée en affichant les performances respectives.<br/>
**Student.java** : classe à générer pour comparer les performances.<br/>
**StudentGenerator.java** : runnable permettant la génération séquentielle ou multithreadée de Student aux données aléatoires.<br/>


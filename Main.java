package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Soyez les bienvenus dans QUIZIS !  LE JEU QUI VOUS PERMET D'APPRENDRE SANS PRÉTENTION.");
        System.out.println("Consigne : Pour les questions de type QCM il faut donner exactement l'un des choix possible.");
        System.out.println("           Pour les questions de type VF il faut ecrire soit vrai soit faux.");
        System.out.println("           Pour les questions de type RC il faut donner le réponse exacte.");
        System.out.println("AUCUNE FAUTE D'ORTHOGRAPHE NE SERA ADMIS");

        // attribution des pseudonymes et choix du nombre de joueurs
        System.out.println("Combien de personnes souhaitent jouer ?");
        int nbJoueur;
        int num=100;
        String etatjoueur="Non selectionné";
        int score =0;
        List<Joueur> tableauJoueursInitiaux = new ArrayList<Joueur>();
        Scanner scanner = new Scanner(System.in);
        nbJoueur=scanner.nextInt();
        while(nbJoueur < 4 || nbJoueur > 20){
            System.err.println("Il faut au minimum 4 joueurs et au maximum de 20 joueurs");
            System.out.println("Combien de personnes souhaitent jouer ? (nombre compris entre 4 et 20)");
            nbJoueur=scanner.nextInt();
        }
        for(int i=0; i<nbJoueur;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Donnez un nom à votre avatar joueur "+(i+1));
            String nom = scan.nextLine();
            Joueur j = new Joueur(num,nom,score,etatjoueur);
            tableauJoueursInitiaux.add(j);
            num+=10;
        }
        System.out.println("Merci d'avoir remplis les champs demandés");
        Joueurs game =new Joueurs(tableauJoueursInitiaux);
        System.out.println("Voici les joueurs sélectionnés pour la phase 1 :");
        System.out.println(game.selectionAleatoire(nbJoueur));
        List<Joueur> JoueursSelectionnes = game.getTableauJoueursSelectionnés();





        //Ajout des thèmes
        List<String> listTheme = new ArrayList<String>();
        listTheme.add("manga");
        listTheme.add("animal");
        listTheme.add("sport");
        listTheme.add("cultureG");
        listTheme.add("voiture");
        listTheme.add("rap");
        listTheme.add("serie");
        listTheme.add("film");
        listTheme.add("histoire");
        listTheme.add("francais");
        //listTheme.add("citoyennete");
        System.out.println("Les thèmes disponibles sont : " + listTheme);

        //Ajout des questions

        List<TypeQuestionQCM> QCM = new ArrayList<TypeQuestionQCM>();
        TypeQuestionQCM qcm1 = new TypeQuestionQCM(new Question("animal",1,"Quel est le manga le plus vendu au monde ? ","one piece"),"one piece","death note", "fairy tail");
        QCM.add(qcm1);
        TypeQuestionQCM qcm2 = new TypeQuestionQCM(new Question("manga",1,"Quelle est le personnage capable de manier 3 sabres a la fois ? ","zoro"),"zoro","kinemon", "brook");
        QCM.add(qcm2);

        List<TypeQuestionVF> VF = new ArrayList<TypeQuestionVF>();

        //TypeQuestionVF vf1 = new TypeQuestionVF(new Question("manga", 1,"Est-ce que le personnage principale de bleach se nomme ichigo kirosaki ?", "vrai"),"vrai","faux");
        //VF.add(vf1);

        List<TypeQuestionRC> RC = new ArrayList<TypeQuestionRC>();
        //TypeQuestionRC rc1 = new TypeQuestionRC(new Question("manga",1,"Qu’elle metier verait Roronoa Zoro dans la vrais vie ?","policier"));
        //RC.add(rc1);




        TypeQuestionQCM qcm3 = new TypeQuestionQCM(new Question("manga",1,"Quelle est le reve de Luffy dans one Piece","le roi des pirates"),"amiral","le roi des pirates", "hokage");
        QCM.add(qcm3);

        TypeQuestionQCM qcm4 = new TypeQuestionQCM(new Question("manga",2,"Le manga le plus vendu en 2020 est ? ","demon Slayer"),"Tokyo revenger ","demon slayer", "one piece");
        QCM.add(qcm4);
        TypeQuestionQCM qcm5 = new TypeQuestionQCM(new Question("manga",2,"Qui a détruit le mur maria? ","titan colossale"),"titan curassée","titan primordio", "titan colossale");
        QCM.add(qcm5);
        TypeQuestionQCM qcm6 = new TypeQuestionQCM(new Question("manga",2,"Qui est le premier pokemon de Sacha ? ","pikachu"),"salameche","dracaufeu", "pikachu");
        QCM.add(qcm6);

        TypeQuestionQCM qcm7 = new TypeQuestionQCM(new Question("manga",3,"Qui s'occupe de la confection des uniforme du toman ? ","Mitsuya"),"baji","Mitsuya", "Mikey");
        QCM.add(qcm7);
        TypeQuestionQCM qcm8 = new TypeQuestionQCM(new Question("manga",3,"La franchise la plus rentable ? ","pokemon"),"one piece","death note", "pokemon");
        QCM.add(qcm8);
        TypeQuestionQCM qcm9 = new TypeQuestionQCM(new Question("manga",3,"La categorie de manga reservé au fille est ? ","shojo"),"shonen","josei", "shojo");
        QCM.add(qcm9);


        //theme animaux

        TypeQuestionQCM qcm10 = new TypeQuestionQCM(new Question("animal",1,"Qu’elle est l’animal le plus rapide ? ","guepar"),"rat","lievre", "guepar");
        QCM.add(qcm10);
        TypeQuestionQCM qcm11 = new TypeQuestionQCM(new Question("animal",1,"Qu’elle est le plus grand mamifer marin du monde ? ","baleine"),"élephan","baleine", "requin");
        QCM.add(qcm11);
        TypeQuestionQCM qcm12 = new TypeQuestionQCM(new Question("animal",1,"Pourquoi le caméléon change t-il de couleur ? ","se cacher"),"se cacher","communique", "se protege de la chaleur");
        QCM.add(qcm12);

        TypeQuestionQCM qcm13 = new TypeQuestionQCM(new Question("animal",2,"Qu’elle est l’espérance d’un chien ? ","14 ans "),"8 ans ","14 ans ", "20 ans ");
        QCM.add(qcm13);
        TypeQuestionQCM qcm14 = new TypeQuestionQCM(new Question("animal",2,"Qu’elle est bruit du chien ? ","aboiement"),"miaulement","aboiement ", "rotement");
        QCM.add(qcm14);
        TypeQuestionQCM qcm15 = new TypeQuestionQCM(new Question("animal",2," Combien de metre peut creuser un taupe chaque jour ?","20"),"5","20", "15");
        QCM.add(qcm15);

        TypeQuestionQCM qcm16 = new TypeQuestionQCM(new Question("animal",3,"Le coup de la girafe pese combien ? ","270"),"250","270", "285");
        QCM.add(qcm16);
        TypeQuestionQCM qcm17 = new TypeQuestionQCM(new Question("animal",3,"Combien pese un ourson polaire a sa naissance ? ","100g"),"100g","250g", "80g");
        QCM.add(qcm17);
        TypeQuestionQCM qcm18 = new TypeQuestionQCM(new Question("animal",3,"Comment appelle t-on le bois des cerf ? ","EUCALYPTUD"),"bois","EUCALYPTUD", "Corne");
        QCM.add(qcm18);

        //theme 3
        TypeQuestionQCM qcm19 = new TypeQuestionQCM(new Question("sport",1,"Combien dure les prolongation d’un match de foot ? ","30"),"15","30", "45");
        QCM.add(qcm19);
        TypeQuestionQCM qcm20 = new TypeQuestionQCM(new Question("sport",1,"Combien dure une mi-temps ? ","45"),"45","8", "30");
        QCM.add(qcm20);
        TypeQuestionQCM qcm21 = new TypeQuestionQCM(new Question("sport",1,"Qu’elle est le pays qui organise la dernier coupe du monde de handball, ?","quatar"),"quatar","Lituani", "France");
        QCM.add(qcm21);

        TypeQuestionQCM qcm22 = new TypeQuestionQCM(new Question("sport",2,"Ou a eu lieu la 1er coupe du monde ? ","Uruguay"),"argentine","France", "Uruguay");
        QCM.add(qcm22);
        TypeQuestionQCM qcm23 = new TypeQuestionQCM(new Question("sport",2,"Quand a eu lieu la 1er coupe du monde de foot? ","1933"),"1933","1956", "1934");
        QCM.add(qcm23);
        TypeQuestionQCM qcm24 = new TypeQuestionQCM(new Question("sport",2,"Les jeux olympique ont lieu tous les … ? ","4ans"),"5ans","3ans", "4ans");
        QCM.add(qcm24);

        TypeQuestionQCM qcm25 = new TypeQuestionQCM(new Question("sport",3,"Qu’elle est le diametre d’un panier de basket ? ","18"),"15","18", "19");
        QCM.add(qcm25);
        TypeQuestionQCM qcm26 = new TypeQuestionQCM(new Question("sport",3," Combien de sport ont été ajouté dans les jeu olympique de 2008 ?","28"),"28","35", "40");
        QCM.add(qcm26);
        TypeQuestionQCM qcm27 = new TypeQuestionQCM(new Question("sport",3," Combien ya t-il d’arbitre lors d’un match de handball ? ","2"),"2","4", "3");
        QCM.add(qcm27);



//theme cultureG
        TypeQuestionQCM qcm28 = new TypeQuestionQCM(new Question("cultureG",1,"Le PH d’un acide est de combien ?","=7"),"=7","<7", ">7");
        QCM.add(qcm28);
        TypeQuestionQCM qcm29 = new TypeQuestionQCM(new Question("cultureG",1,"Combien y’a t_il d’electron de valence dans l’oxygene ?","6"),"4","5", "6");
        QCM.add(qcm29);
        TypeQuestionQCM qcm30 = new TypeQuestionQCM(new Question("cultureG",1,"En combien de temps la terre tourne au-tour du soleil ?","365+1/4"),"365+1/4","365", "366");
        QCM.add(qcm30);

        TypeQuestionQCM qcm31 = new TypeQuestionQCM(new Question("cultureG",2,"Qui a crée cette formule E=mc^2 ?","newton"),"newton","galilée", "Einstein");
        QCM.add(qcm31);
        TypeQuestionQCM qcm32 = new TypeQuestionQCM(new Question("cultureG",2,"Qu’elle scientique donne son nom pour l’unité de la puissance ?","James Joule"),"James Joule","James watts", "marie Ampere");
        QCM.add(qcm32);
        TypeQuestionQCM qcm33= new TypeQuestionQCM(new Question("cultureG",2,"Qui a ecrit le malade imaginaire ?","moliere"),"voltaire","Rousseau", "Moliere");
        QCM.add(qcm33);


        TypeQuestionQCM qcm34 = new TypeQuestionQCM(new Question("cultureG",3,"Qu’elle est le primitive de ln(x)?",""),"","", "");
        QCM.add(qcm34);
        TypeQuestionQCM qcm35= new TypeQuestionQCM(new Question("cultureG",3,"Qui a ecrit l’illiade et l’odyssée ?","Homère"),"Homère","Moliere", "Rousseau");
        QCM.add(qcm35);
        TypeQuestionQCM qcm36 = new TypeQuestionQCM(new Question("cultureG",3,"Le drapeau russe est bleu , blanc et … ?","rouge"),"rouge","vert", "noir");
        QCM.add(qcm36);


//theme voiture

        TypeQuestionQCM qcm37 = new TypeQuestionQCM(new Question("voiture",1,"Une voiture familial peut avoir combien de place maximum ?","7"),"5","7", "3");
        QCM.add(qcm37);
        TypeQuestionQCM qcm38 = new TypeQuestionQCM(new Question("voiture",1,"Une voiture a combien de roue motrice en general ?","2"),"2","4", "3");
        QCM.add(qcm38);
        TypeQuestionQCM qcm39 = new TypeQuestionQCM(new Question("voiture",1,"Qu’ elle est le prix de la voiture la moins cher au monde ?","1600"),"1600","1800", "2000");
        QCM.add(qcm39);


        TypeQuestionQCM qcm40 = new TypeQuestionQCM(new Question("voiture",2,"Les ligne blanche sur l’autoroute on était crée en ?","1930"),"1936","1924", "1935");
        QCM.add(qcm40);
        TypeQuestionQCM qcm41 = new TypeQuestionQCM(new Question("voiture",2,"quelle est la marque de voiture la plus vendu en france","peugeot"),"renaud","peugeot", "toyota");
        QCM.add(qcm41);
        TypeQuestionQCM qcm42 = new TypeQuestionQCM(new Question("voiture",2,"quelle est le modele de voiture la plus vendu en france?","peugeot 208"),"peugeot 3008","peugeot 208", "renaud clio 5");
        QCM.add(qcm42);


        TypeQuestionQCM qcm43 = new TypeQuestionQCM(new Question("voiture",3,"qu'elle est la marque la plus vendu dans le monde","toyota corolla"),"peugeot 208","peugeot 3008", "toyota corolla");
        QCM.add(qcm43);
        TypeQuestionQCM qcm44 = new TypeQuestionQCM(new Question("voiture",3,"la voiture la plus rapide au monde peux aller jusqu'a ... ?","420 km/h"),"500km/h","180km/h", "420km/");
        QCM.add(qcm44);
        TypeQuestionQCM qcm45 = new TypeQuestionQCM(new Question("voiture",3,"qu'elle est la marque de voiture la plus rapide au monde?","Bugatti"),"Bugatti","ferrari", "porsche");
        QCM.add(qcm45);


//theme rap

        TypeQuestionQCM qcm46 = new TypeQuestionQCM(new Question("rap",1,"Qu’elle groupe du rap est l’auteur de graver dans le roche ?","sniper"),"sniper","iam", "ntm");
        QCM.add(qcm46);
        TypeQuestionQCM qcm47 = new TypeQuestionQCM(new Question("rap",1,"Le debut du rap est arrivé dans qu’elle pays ?","etat-unis"),"France","anglerre", "etat-unis");
        QCM.add(qcm47);
        TypeQuestionQCM qcm48 = new TypeQuestionQCM(new Question("rap",1,"Qui n’est pas un duo ?","sch"),"sch","pnl", "djadja et dinaz");
        QCM.add(qcm48);

        TypeQuestionQCM qcm49 = new TypeQuestionQCM(new Question("rap",2,"Qu’elle est le nom du groupe composer des rapper JoeyStar Kool Shen ?","ntm"),"ntm","iam", "sniper");
        QCM.add(qcm49);
        TypeQuestionQCM qcm50 = new TypeQuestionQCM(new Question("rap",2,"Qu’elle rappeur on fait un clip sur la tour Eiffel ?","pnl"),"jul","pnl", "sch");
        QCM.add(qcm50);
        TypeQuestionQCM qcm51 = new TypeQuestionQCM(new Question("rap",2,"Qu’elle rapper est assasiné  en 1996 ?","Tupac"),"eminem","SnoopDog", "Tupac");
        QCM.add(qcm51);



        TypeQuestionQCM qcm52 = new TypeQuestionQCM(new Question("rap",3,"Qu’elle est le rappeur qui sort « fallait que je te dise que mon bonheur tes dedier et tu peux marcher sur mon cœur car mon cœur est à tes pied »","sniper"),"iam","ntm", "sniper");
        QCM.add(qcm52);
        TypeQuestionQCM qcm53 = new TypeQuestionQCM(new Question("rap",3,"Qui est nommé meuilleur artiste en 1994 aux music award ?","Mc solar"),"booba","mc solar", "iam");
        QCM.add(qcm53);
        TypeQuestionQCM qcm54 = new TypeQuestionQCM(new Question("rap",3,"Comment s’appelle Lacrim ?","Karim"),"Karim","yassin", "Tarrik");
        QCM.add(qcm54);




        //Theme serie

        TypeQuestionQCM qcm55 = new TypeQuestionQCM(new Question("serie",1,"Ou se deroule Friends ?","New york"),"new york","seatle", "san francisco");
        QCM.add(qcm55);
        TypeQuestionQCM qcm56 = new TypeQuestionQCM(new Question("serie",1,"Qu’elle serie Omar Sy est le personnage principal ?","lupin"),"casa de papel","lupin", "H");
        QCM.add(qcm56);
        TypeQuestionQCM qcm57 = new TypeQuestionQCM(new Question("serie",1,"Qu’elle Anime, Netflix a adapté en live Action ?","death note"),"attaque des titan","dragon ball", "death note");
        QCM.add(qcm57);

        TypeQuestionQCM qcm58 = new TypeQuestionQCM(new Question("serie",2,"Qu’elle est l’heroine de la serie qui se deroule a Paris ?","emily in paris"),"julia in paris","Betty in paris", "");
        QCM.add(qcm58);
        TypeQuestionQCM qcm59 = new TypeQuestionQCM(new Question("serie",2,"Au debut de la serie Breaking bad on apprend qu’il reste …ans A Vivre ?","2"),"1","2", "3");
        QCM.add(qcm59);
        TypeQuestionQCM qcm60 = new TypeQuestionQCM(new Question("serie",2,"Qu’elle est le thème abordé dans Grey Anatomy ?","médecine"),"medecine","policier", "piraterie");
        QCM.add(qcm60);

        TypeQuestionQCM qcm61 = new TypeQuestionQCM(new Question("serie",3,"Dans le casa de papel ,Les masque sont inspiré de quelle artiste ?","salvator dali "),"picaso","salvator dali ", "Van gogh");
        QCM.add(qcm61);
        TypeQuestionQCM qcm62 = new TypeQuestionQCM(new Question("serie",3,"Depuis combien d’année dur la serie les feux de l’amour ?","48"),"48","45", "60");
        QCM.add(qcm62);
        TypeQuestionQCM qcm63 = new TypeQuestionQCM(new Question("serie",3,"Qui meurt au premier episode dans Desparate Housewise ?","Mary Alice"),"Mary Alice ","Martha Huber", "Susan Delfino");
        QCM.add(qcm63);

//film
        TypeQuestionQCM qcm64 = new TypeQuestionQCM(new Question("film",1,"Qu’elle est le genre de Conjuring ?","horreur"),"drama","horreur", "comedie");
        QCM.add(qcm64);
        TypeQuestionQCM qcm65 = new TypeQuestionQCM(new Question("film",1,"Dans qu’elle film Omar Sy c’est fait connaitre ?","intouchable"),"qu'est qu'on a fait au bon dieu","intouchable", "comment tuer son boss");
        QCM.add(qcm65);
        TypeQuestionQCM qcm66 = new TypeQuestionQCM(new Question("film",1,"Dans qu’elle serie le personnage principale essaye de tuer leur boss","comment tuer son boss"),"very bad trip","comment tuer son boss", "fast and furious");
        QCM.add(qcm66);

        TypeQuestionQCM qcm67 = new TypeQuestionQCM(new Question("film",2,"Comment se nomme le fils du roi Lion ?","simba"),"simba","timon", "pumba");
        QCM.add(qcm67);
        TypeQuestionQCM qcm68 = new TypeQuestionQCM(new Question("film",2,"D’où vient la music « libère delivrer «»?","la reine des neige"),"la reine des neige ","le monde de nemo", "le roi lion");
        QCM.add(qcm68);
        TypeQuestionQCM qcm69 = new TypeQuestionQCM(new Question("film",2,"Comment s’appelle les sœur de cendrillons ?","anastasie et jovette"),"anastatie et serena","anastasie et jovette", "anastatie et catherine");
        QCM.add(qcm69);


        TypeQuestionQCM qcm70 = new TypeQuestionQCM(new Question("film",3,"Qu’elle est le premier film disney sortie ?","steamboat willie"),"les troie petit cochon","blanche neige", "steamboat willie");
        QCM.add(qcm70);
        TypeQuestionQCM qcm71 = new TypeQuestionQCM(new Question("film",3,"Qui est le réalisateur du Kill Bill","quentin tarentino"),"quentin tarentino","steven spielberg", "wes anderson");
        QCM.add(qcm71);
        TypeQuestionQCM qcm72 = new TypeQuestionQCM(new Question("film",3,"Quel animal faut suivre dans matrix ?","lapin"),"chien","coq", "lapin");
        QCM.add(qcm72);

        //theme histoire
        TypeQuestionQCM qcm73 = new TypeQuestionQCM(new Question("histoire",1,"Quand fini la 1er seconde guerre mondial ?","1918"),"1914","1918", "1917");
        QCM.add(qcm73);
        TypeQuestionQCM qcm74 = new TypeQuestionQCM(new Question("histoire",1,"Comment debute la 1er guerre mondiale ?","Assassina de l’archiduc François-Ferdinant"),"Assassina de l’archiduc François-Ferdinant","Attaque de Hongris", "Attaque de l’allemagne ");
        QCM.add(qcm74);
        TypeQuestionQCM qcm75 = new TypeQuestionQCM(new Question("histoire",1,"L’allience de l’Axe etais composer de qu’elle pays","Allemagne ,Japon , Italie"),"Allemagne ,Japon , Italie","-chine ,URSS ,Japon", "France Angletterre et Italie");
        QCM.add(qcm75);

        TypeQuestionQCM qcm76 = new TypeQuestionQCM(new Question("histoire",2,"Par qui a été vaincu versingetorix ?","jules Cesar"),"Napoleon Bonaparte","jules Cesar", "Clovis Ier ");
        QCM.add(qcm76);
        TypeQuestionQCM qcm77 = new TypeQuestionQCM(new Question("histoire",2,"Qui composer le front Populaire en France ?","Les radicaux , les socialistes et les communiste"),"Les radicaux , les socialistes et les communiste","Les radicaux et les socialistes", "les radicaux et les ligue");
        QCM.add(qcm77);
        TypeQuestionQCM qcm78 = new TypeQuestionQCM(new Question("histoire",2,"Quand accorde t-on le droit de vote au femme en France ?","1945"),"1945","1956", "1946");
        QCM.add(qcm78);

        TypeQuestionQCM qcm79 = new TypeQuestionQCM(new Question("histoire",3,"En qu’elle année charle de Gaule devient-il le premier president de la 5eme republique ?","1959"),"1959","1441", "1955");
        QCM.add(qcm79);
        TypeQuestionQCM qcm80 = new TypeQuestionQCM(new Question("histoire",3,"En qu’elle année la guerre de 100 ans fini t-elle ?","1453"),"1455","1453", "1458");
        QCM.add(qcm80);
        TypeQuestionQCM qcm81 = new TypeQuestionQCM(new Question("histoire",3,"Quand Napoléon vainc les autrichien lors de la bataille de Wagram ?","1809"),"1810","1809", "1815");
        QCM.add(qcm81);

        //FRANCAIS
        TypeQuestionQCM qcm82 = new TypeQuestionQCM(new Question("francais",1,"Qu’elle l’adverbe dans les proposition suivante « tes lunettes sont ailleurs dans l’appartement »","ailleurs"),"ailleurs","sont ", "lunette");
        QCM.add(qcm82);
        TypeQuestionQCM qcm83 = new TypeQuestionQCM(new Question("francais",1,"Lequel des mot suivant est mal écrit ?","vous appellez "),"nous appelons ","vous appellez ", "vous pelez  ");
        QCM.add(qcm83);
        TypeQuestionQCM qcm84 = new TypeQuestionQCM(new Question("francais",1,"Lequel des mot suivant est mal écrit ?","Lesson"),"laissons","laçais", "Lesson");
        QCM.add(qcm84);


        TypeQuestionQCM qcm85 = new TypeQuestionQCM(new Question("francais",2,"« cette application indique le … » qu’elle est la bonne reponse","trafic"),"traffique","trafic", "traffic");
        QCM.add(qcm85);
        TypeQuestionQCM qcm86 = new TypeQuestionQCM(new Question("francais",2,"« il est …» qu’elle est la bonne réponse ?","bizarre"),"bizarre ","bizzarre", "bizare ");
        QCM.add(qcm86);
        TypeQuestionQCM qcm87 = new TypeQuestionQCM(new Question("francais",2,"Demain ,… le l’électricien ?","j’appelerai"),"j’apellerai","j’appelerai", "j’appelerai ");
        QCM.add(qcm87);

        TypeQuestionQCM qcm88 = new TypeQuestionQCM(new Question("francais",3,"On doit ….. aux clients ?","donner un acompte "),"doné un acompte","donner un acompte ", "donné un acompte");
        QCM.add(qcm88);
        TypeQuestionQCM qcm89 = new TypeQuestionQCM(new Question("francais",3,"« Je dois … mais j’ai la flemme »","travailler"),"travailler","travallais", "travaillée ");
        QCM.add(qcm89);
        TypeQuestionQCM qcm90 = new TypeQuestionQCM(new Question("francais",3,"« Qu’elle sera le prochain …. Du roi ?","successeur "),"suceseur","succeseurs", "successeur");
        QCM.add(qcm90);





        //MANGA
        //facile
        TypeQuestionVF vf1 = new TypeQuestionVF(new Question("manga", 1,"Est-ce que le personnage principale de bleach se nomme ichigo kirosaki ?", "vrai"),"vrai","faux");
        VF.add(vf1);
        TypeQuestionVF vf2 = new TypeQuestionVF(new Question("manga", 1,"Est-ce ryuk dans Death note mange des poire tous les jour ?", "faux"),"vrai","faux");
        VF.add(vf2);
        TypeQuestionVF vf3 = new TypeQuestionVF(new Question("manga", 1,"Est-ce que le mangaka de Dragon-Ball de eichiro oda ?", "faux"),"vrai","faux");
        VF.add(vf3);

        //moyen
        TypeQuestionVF vf4 = new TypeQuestionVF(new Question("manga", 2,"Est-ce que eren a déjà gagner le concour de popularité de son manga ?", "faux"),"vrai","faux");
        VF.add(vf4);
        TypeQuestionVF vf5 = new TypeQuestionVF(new Question("manga", 2,"Est-ce que le pouvoir d’All might a etais transmit a izuku ?", "vrai"),"vrai","faux");
        VF.add(vf5);
        TypeQuestionVF vf6 = new TypeQuestionVF(new Question("manga", 2,"Le mange le populaire de sa generation est Fairy tail ?", "faux"),"vrai","faux");
        VF.add(vf6);

        //difficile
        TypeQuestionVF vf7 = new TypeQuestionVF(new Question("manga", 3,"Est-ce que l’Allemagne est le plus grand consomateur de Manga en Europe ?", "faux"),"vrai","faux");
        VF.add(vf7);
        TypeQuestionVF vf8 = new TypeQuestionVF(new Question("manga", 3,"Est-ce l’œil droit de Boruto se nomme le Jogai ?", "vrai"),"vrai","faux");
        VF.add(vf8);
        TypeQuestionVF vf9 = new TypeQuestionVF(new Question("manga", 3,"EST-CE QUE LE NUMERO D'EXAMEN DE GON ETAIT LE 405 ?", "vrai"),"vrai","faux");
        VF.add(vf9);


        //Animal
        //facile
        TypeQuestionVF vf10 = new TypeQuestionVF(new Question("animal", 1,"Est-ce qu’une araigner a 8 patte ?", "faux"),"vrai","faux");
        VF.add(vf10);
        TypeQuestionVF vf11 = new TypeQuestionVF(new Question("animal", 1,"Est-ce tous les chien ont une queue ?", "faux"),"vrai","faux");
        VF.add(vf11);
        TypeQuestionVF vf12 = new TypeQuestionVF(new Question("animal", 1,"Est que l’animal le plus lent est le lievre ?", "faux"),"vrai","faux");
        VF.add(vf12);
        //moyen
        TypeQuestionVF vf13 = new TypeQuestionVF(new Question("animal", 2,"Les patte du du tyrannausore est-il plus court que sa tete ?", "vrai"),"vrai","faux");
        VF.add(vf13);
        TypeQuestionVF vf14 = new TypeQuestionVF(new Question("animal", 2,"Le koala boit-il beaucoup d’eau ?", "vrai"),"vrai","faux");
        VF.add(vf14);
        TypeQuestionVF vf15 = new TypeQuestionVF(new Question("animal", 2,"LE KANGOUROU PEUT-IL VIVRE DANS UN ARBRE ?", "vrai"),"vrai","faux");
        VF.add(vf15);
        //difficile
        TypeQuestionVF vf16 = new TypeQuestionVF(new Question("animal", 3,"Le loup vivent t-ils en meute ?", "vrai"),"vrai","faux");
        VF.add(vf16);
        TypeQuestionVF vf17 = new TypeQuestionVF(new Question("animal", 3,"Les lion est les tigre se battent-il souvent ?", "faux"),"vrai","faux");
        VF.add(vf17);
        TypeQuestionVF vf18 = new TypeQuestionVF(new Question("animal", 3,"Les girafe dorment t-elle beaucoup ?", "faux"),"vrai","faux");
        VF.add(vf18);


        //Sport
        //facile
        TypeQuestionVF vf19 = new TypeQuestionVF(new Question("sport", 1,"Le sport le plus connus au monde est le volley-ball ?", "faux"),"vrai","faux");
        VF.add(vf19);
        TypeQuestionVF vf20 = new TypeQuestionVF(new Question("sport", 1,"L’equipe qui a gagner la coupe du monde de 2010 est-il l’Espagne ?", "vrai"),"vrai","faux");
        VF.add(vf20);
        TypeQuestionVF vf21 = new TypeQuestionVF(new Question("sport", 1,"IL n’est pas necessaire de boire de l’eau après une seance de sport ?", "faux"),"vrai","faux");
        VF.add(vf21);

        //moyen
        TypeQuestionVF vf22 = new TypeQuestionVF(new Question("sport", 2,"Pour gagner un set au volley il faut marqué 20 point ?", "faux"),"vrai","faux");
        VF.add(vf22);
        TypeQuestionVF vf23 = new TypeQuestionVF(new Question("sport", 2,"Le vainceur de la coupe du monde de handball en 2015 est-il l’Espagne ?", "faux"),"vrai","faux");
        VF.add(vf23);
        TypeQuestionVF vf24 = new TypeQuestionVF(new Question("sport", 2,"Le capitaine de l’equipe de France de handball est Tierry Omerry ?", "faux"),"vrai","faux");
        VF.add(vf24);

        //diff
        TypeQuestionVF vf25 = new TypeQuestionVF(new Question("sport", 3,"Le premier sport autorisé au femme pendant les jeux olympque est-il le tenis ?", "vrai"),"vrai","faux");
        VF.add(vf25);
        TypeQuestionVF vf26 = new TypeQuestionVF(new Question("sport", 3,"Tiger wood a-t-il rempoter le Masters a 25 ans ?", "faux"),"vrai","faux");
        VF.add(vf26);
        TypeQuestionVF vf27 = new TypeQuestionVF(new Question("sport", 3,"Le pays d’origine du handball est l’allemagne ?", "faux"),"vrai","faux");
        VF.add(vf27);

        //cultureG
        //facile
        TypeQuestionVF vf28 = new TypeQuestionVF(new Question("cultureG", 1,"La fin de la 1er guerre monde est le 11 novembre 1918 ?", "vrai"),"vrai","faux");
        VF.add(vf28);
        TypeQuestionVF vf29 = new TypeQuestionVF(new Question("cultureG", 1,"La capitale du Maroc est ce Marrakech ?", "faux"),"vrai","faux");
        VF.add(vf29);
        TypeQuestionVF vf30 = new TypeQuestionVF(new Question("cultureG", 1,"Le ph d’un acide est superieur a 7 ?", "faux"),"vrai","faux");
        VF.add(vf30);

        //moyen
        TypeQuestionVF vf31 = new TypeQuestionVF(new Question("cultureG", 2,"Il n’y a pas de prix nobel de mathematique ?", "faux"),"vrai","faux");
        VF.add(vf31);
        TypeQuestionVF vf32 = new TypeQuestionVF(new Question("cultureG", 2,"Le plus long fleuve d’europe est il le rhin ?", "vrai"),"vrai","faux");
        VF.add(vf32);
        TypeQuestionVF vf33 = new TypeQuestionVF(new Question("cultureG", 2,"Le plus grand baron de le drogue est-ce pablo Escobar ?", "vrai"),"vrai","faux");
        VF.add(vf33);

        //difficile
        TypeQuestionVF vf34 = new TypeQuestionVF(new Question("cultureG", 3,"Le roi des dieu était –il zeus ?", "vrai"),"vrai","faux");
        VF.add(vf34);
        TypeQuestionVF vf35 = new TypeQuestionVF(new Question("cultureG", 3,"Louis XVI a-t-il était pendu?", "faux"),"vrai","faux");
        VF.add(vf35);
        TypeQuestionVF vf36 = new TypeQuestionVF(new Question("cultureG", 3,"La tour Eiffel mesure 365m de hauteur ?", "faux"),"vrai","faux");
        VF.add(vf36);

        //voiture
        //facile
        TypeQuestionVF vf37 = new TypeQuestionVF(new Question("voiture", 1,"La marque de la C8 Double est-elle la Citroën ", "vrai"),"vrai","faux");
        VF.add(vf37);
        TypeQuestionVF vf38 = new TypeQuestionVF(new Question("voiture", 1,"Le PRIX de la voiture la plus cher du monde est 23 M?", "vrai"),"vrai","faux");
        VF.add(vf38);
        TypeQuestionVF vf39 = new TypeQuestionVF(new Question("voiture", 1,"Un voiture est volée toute les 6Seconnde dans le monde ?", "vrai"),"vrai","faux");
        VF.add(vf39);

        //moyen
        TypeQuestionVF vf40 = new TypeQuestionVF(new Question("voiture", 2,"Les astronaute recevée un Corvette à leur retour de l’espace ?", "vrai"),"vrai","faux");
        VF.add(vf40);
        TypeQuestionVF vf41 = new TypeQuestionVF(new Question("voiture", 2,"Michelin a-t-il inventer le chambre a air ?", "faux"),"vrai","faux");
        VF.add(vf41);
        TypeQuestionVF vf42 = new TypeQuestionVF(new Question("voiture", 2,"BMW possede t-il Bentley ?", "vrai"),"vrai","faux");
        VF.add(vf42);

        //difficle
        TypeQuestionVF vf43 = new TypeQuestionVF(new Question("voiture", 3,"Le record de vitesse actuel sur circuit est-t-il de 523 km/h ?", "faux"),"vrai","faux");
        VF.add(vf43);
        TypeQuestionVF vf44 = new TypeQuestionVF(new Question("voiture", 3," EST-ce-que Renault appartients au groupe PSA ?", "faux"),"vrai","faux");
        VF.add(vf44);
        TypeQuestionVF vf45 = new TypeQuestionVF(new Question("voiture", 3,"Le model T est-il le premier model de Ford ?", "vrai"),"vrai","faux");
        VF.add(vf45);

        //rap
        //facile
        TypeQuestionVF vf46 = new TypeQuestionVF(new Question("rap", 1,"Maitre gym c’est fait connaitre avec sexion d’assaut ? ", "vrai"),"vrai","faux");
        VF.add(vf46);
        TypeQuestionVF vf47 = new TypeQuestionVF(new Question("rap", 1,"Jul est-il le grand vendeur de disque de l’histoire du rap FRANÇAIS ?", "faux"),"vrai","faux");
        VF.add(vf47);
        TypeQuestionVF vf48 = new TypeQuestionVF(new Question("rap", 1,"Est que SCH chante « Avant la douane » ?", "faux"),"vrai","faux");
        VF.add(vf48);

        //moyen
        TypeQuestionVF vf49 = new TypeQuestionVF(new Question("rap", 2,"« ma question prefere qu’est que je vais faire de tous cette oseille » vient-elle du titre kalash ?", "vrai"),"vrai","faux");
        VF.add(vf49);
        TypeQuestionVF vf50 = new TypeQuestionVF(new Question("rap", 2,"Ya t-il un titre qui se s’appelle « on m’appelle l’ovni »", "vrai"),"vrai","faux");
        VF.add(vf50);
        TypeQuestionVF vf52 = new TypeQuestionVF(new Question("rap", 2,"« On n’est pas condamnée a l’echec »est ecrit par Kery James ?", "vrai"),"vrai","faux");
        VF.add(vf52);

        //difficle
        TypeQuestionVF vf53 = new TypeQuestionVF(new Question("rap", 3,"Le premier single de jul est-il le Cross volé ?", "vrai"),"vrai","faux");
        VF.add(vf53);
        TypeQuestionVF vf54 = new TypeQuestionVF(new Question("rap", 3,"Jul est-il le grand vendeur de disque de l’histoire du rap FRANÇAIS ?", "vrai"),"vrai","faux");
        VF.add(vf54);
        TypeQuestionVF vf55 = new TypeQuestionVF(new Question("rap", 3,"Est-ce Kery james qui a realiser Banlieusards ?", "vrai"),"vrai","faux");
        VF.add(vf55);

        //serie
        //facile
        TypeQuestionVF vf56 = new TypeQuestionVF(new Question("serie", 1,"La serie Walking dead est sur les Vampire ?", "faux"),"vrai","faux");
        VF.add(vf56);
        TypeQuestionVF vf57 = new TypeQuestionVF(new Question("serie", 1,"James Debbouzz a t-ll jouer dans H ?", "vrai"),"vrai","faux");
        VF.add(vf57);
        TypeQuestionVF vf58 = new TypeQuestionVF(new Question("serie", 1,"Y-a-t-il 9 saison dans friends ?", "faux"),"vrai","faux");
        VF.add(vf58);

        //moyen
        TypeQuestionVF vf59 = new TypeQuestionVF(new Question("serie", 2,"Gray’s Anatomy le serie se deroule a los Angeles ?", "faux"),"vrai","faux");
        VF.add(vf59);
        TypeQuestionVF vf60 = new TypeQuestionVF(new Question("serie", 2,"La serie Desperate Housewise se joue-il a Fairviex ?", "vrai"),"vrai","faux");
        VF.add(vf60);
        TypeQuestionVF vf61 = new TypeQuestionVF(new Question("serie", 2,"Le vrais prénom de Joe dans You est-il Jone ?", "faux"),"vrai","faux");
        VF.add(vf61);

        //difficle
        TypeQuestionVF vf62 = new TypeQuestionVF(new Question("serie", 3,"La premier foix qu’est diffusé Desparate Housewise en France est en 2004 ?", "vrai"),"vrai","faux");
        VF.add(vf62);
        TypeQuestionVF vf63 = new TypeQuestionVF(new Question("serie", 3,"Y-a-t-il 5 saison dans Desperate Housewise ?", "faux"),"vrai","faux");
        VF.add(vf63);
        TypeQuestionVF vf64 = new TypeQuestionVF(new Question("serie", 3,"Y-a-t-il 50 saison dans les feux de l’amour ?", "faux"),"vrai","faux");
        VF.add(vf64);


        //film
        //facile
        TypeQuestionVF vf65 = new TypeQuestionVF(new Question("film", 1,"Omar Sy c’est -il fait connaitre par le film qu’est qu’on a fait au bon dieu ?", "faux"),"vrai","faux");
        VF.add(vf65);
        TypeQuestionVF vf66 = new TypeQuestionVF(new Question("film", 1,"Harry Potter proviens-il d’un film ?", "vrai"),"vrai","faux");
        VF.add(vf66);
        TypeQuestionVF vf67 = new TypeQuestionVF(new Question("film", 1,"Intouchable provient-elle d’une histoire vrais ?", "vrai"),"vrai","faux");
        VF.add(vf67);

        //moyen
        TypeQuestionVF vf68 = new TypeQuestionVF(new Question("film", 2,"Y-a-t-il un film Disney qui se nomme la reine des Glace ?", "faux"),"vrai","faux");
        VF.add(vf68);
        TypeQuestionVF vf69 = new TypeQuestionVF(new Question("film", 2,"Simba rencontre-il Timon et Pumbaa dans la foret ?", "faux"),"vrai","faux");
        VF.add(vf69);
        TypeQuestionVF vf70 = new TypeQuestionVF(new Question("film", 2,"Le Roi lion a deccrocher un Oscar ?", "faux"),"vrai","faux");
        VF.add(vf70);

        //difficle
        TypeQuestionVF vf71 = new TypeQuestionVF(new Question("film", 3,"Blanche est-il une adaptation des comte des frere Grimm ?", "vrai"),"vrai","faux");
        VF.add(vf71);
        TypeQuestionVF vf72 = new TypeQuestionVF(new Question("film", 3,"Le film Jumanji de 1995 provient-il d’un film ?", "vrai"),"vrai","faux");
        VF.add(vf72);
        TypeQuestionVF vf73 = new TypeQuestionVF(new Question("film", 3,"Johnny Depp interprete-il Jack Sparrow ?", "vrai"),"vrai","faux");
        VF.add(vf73);


        //histoire
        //facile
        TypeQuestionVF vf74 = new TypeQuestionVF(new Question("histoire", 1,"L’apparation de l’Homme se situe a 5Millions d’année avant j-c ?", "faux"),"vrai","faux");
        VF.add(vf74);
        TypeQuestionVF vf75 = new TypeQuestionVF(new Question("histoire", 1,"Est-ce Christophe Colomb qui a découvert l’Amérique ?", "vrai"),"vrai","faux");
        VF.add(vf75);
        TypeQuestionVF vf76 = new TypeQuestionVF(new Question("histoire", 1,"Les Etat-unis rentre en guerre a cause de l’attaque de Pearl Habor ?", "vrai"),"vrai","faux");
        VF.add(vf76);

        //moyen
        TypeQuestionVF vf77 = new TypeQuestionVF(new Question("histoire", 2,"La France et envahi par l’Allemagne en 1941 ?", "vrai"),"vrai","faux");
        VF.add(vf77);
        TypeQuestionVF vf78 = new TypeQuestionVF(new Question("histoire", 2,"La guerre de 100ans a-t-elle durée 100ans ?", "faux"),"vrai","faux");
        VF.add(vf78);
        TypeQuestionVF vf79 = new TypeQuestionVF(new Question("histoire", 2,"Le moyen Age a-t-il durée 800ans ?", "faux"),"vrai","faux");
        VF.add(vf79);

        //difficle
        TypeQuestionVF vf80 = new TypeQuestionVF(new Question("histoire", 3,"Mussolini a eté un socialiste Italien ?", "vrai"),"vrai","faux");
        VF.add(vf80);
        TypeQuestionVF vf81 = new TypeQuestionVF(new Question("histoire", 3,"Staline était georgien ?", "vrai"),"vrai","faux");
        VF.add(vf81);
        TypeQuestionVF vf82 = new TypeQuestionVF(new Question("histoire", 3,"Le premier dirigeant egyptient a signé un traité de pays avec Israél est Moubarak ?", "vrai"),"vrai","faux");
        VF.add(vf82);

        //francais
        //facile
        TypeQuestionVF vf83 = new TypeQuestionVF(new Question("francais", 1,"Y’a-t-il un faute d’orthographe dans la phrase suivante: « Vous ne saviez pas que votre collègue était si sensibles »", "faux"),"vrai","faux");
        VF.add(vf83);
        TypeQuestionVF vf84 = new TypeQuestionVF(new Question("francais", 1,"L’adjectif dans la phrase suivant est-il bien accordé ? : « virginie lit les roman préférés de mon père »", "vrai"),"vrai","faux");
        VF.add(vf84);
        TypeQuestionVF vf85 = new TypeQuestionVF(new Question("francais", 1,"L’adjectif dans la phrase suivant est-il bien accordé ? : « Ces hommes hauts placés nous connaissent. »", "vrai"),"vrai","faux");
        VF.add(vf85);

        //moyen
        TypeQuestionVF vf86 = new TypeQuestionVF(new Question("francais", 2,"L’adverbe s’accorde t-il avec son verbe ?", "vrai"),"vrai","faux");
        VF.add(vf86);
        TypeQuestionVF vf87 = new TypeQuestionVF(new Question("francais", 2,"Le participe passé ne s’accorde que s’il est placé après le nom ?", "vrai"),"vrai","faux");
        VF.add(vf87);
        TypeQuestionVF vf88 = new TypeQuestionVF(new Question("francais", 2,"Mais et mets peuvent être des nom ?", "vrai"),"vrai","faux");
        VF.add(vf88);

        //difficle
        TypeQuestionVF vf89 = new TypeQuestionVF(new Question("francais", 3,"On met une ç devant a-o-u ?", "vrai"),"vrai","faux");
        VF.add(vf89);
        TypeQuestionVF vf90 = new TypeQuestionVF(new Question("francais", 3,"Le participe passé conjugué avec l’auxiliaire avoir reste invariable si l’objet direct est placé apres ?", "vrai"),"vrai","faux");
        VF.add(vf90);
        TypeQuestionVF vf91 = new TypeQuestionVF(new Question("francais", 3,"Le participe passé des verbe bo-pronominaux s’accorde avec le sujet lorsqu’il n’y pas d’objet direct ?", "vrai"),"vrai","faux");
        VF.add(vf91);






        // reponse courte
        TypeQuestionRC rc1 = new TypeQuestionRC(new Question("manga",1,"Qu’elle metier verait Roronoa Zoro dans la vrais vie ?","policier"));
        RC.add(rc1);
        TypeQuestionRC rc2 = new TypeQuestionRC(new Question("manga",1," Qui a tuer ace a Marine Ford ?","Akainu"));
        RC.add(rc2);
        TypeQuestionRC rc3 = new TypeQuestionRC(new Question("manga",1,"Combien il y a de Corsaire dans One piece ? ","7"));
        RC.add(rc3);

        TypeQuestionRC rc4 = new TypeQuestionRC(new Question("manga",2," Qui est le titan bestial dans snk ?","sieg"));
        RC.add(rc4);
        TypeQuestionRC rc5 = new TypeQuestionRC(new Question("manga",2,"Combien y’a-t-il de boule de cristal dans dragon Ball ? ","7"));
        RC.add(rc5);
        TypeQuestionRC rc6 = new TypeQuestionRC(new Question("manga",2,"Qu’elle est le nom du titan primordiaux d’Eren ? ","titan assaillant"));
        RC.add(rc6);

        TypeQuestionRC rc7 = new TypeQuestionRC(new Question("manga",3," Combien de temps l’humanité est enfermé dans les mur dans l'attaque des titan ?","107"));
        RC.add(rc7);
        TypeQuestionRC rc8 = new TypeQuestionRC(new Question("manga",3," Combien existe-il de titan primordio ?","9"));
        RC.add(rc8);
        TypeQuestionRC rc9 = new TypeQuestionRC(new Question("manga",3," Qui possede la sharingan et n’est pas un Ushiwa ?","Kakashi"));
        RC.add(rc9);

// animaux
        TypeQuestionRC rc10 = new TypeQuestionRC(new Question("animal",1,"Qu’elle est le roi de la jingle?","Lion"));
        RC.add(rc10);
        TypeQuestionRC rc11 = new TypeQuestionRC(new Question("animal",1,"Qu’elle est l’animal le plus fainéant ?","Paresseux"));
        RC.add(rc11);
        TypeQuestionRC rc12 = new TypeQuestionRC(new Question("animal",1,"Combien de patte possède un insecte ?","8"));
        RC.add(rc12);

        TypeQuestionRC rc13 = new TypeQuestionRC(new Question("animal",2,"Une herisson a combien de pique ?","5000"));
        RC.add(rc13);
        TypeQuestionRC rc14 = new TypeQuestionRC(new Question("animal",2,"Qu’elle oiseaux ne vole pas ,mais court ?","l'autruche"));
        RC.add(rc14);
        TypeQuestionRC rc15 = new TypeQuestionRC(new Question("animal",2,"Combien de bras a une etoile de mer ?","5"));
        RC.add(rc15);

        TypeQuestionRC rc16 = new TypeQuestionRC(new Question("animal",3,"Qu’elle est le bruit de cerf ?","rote"));
        RC.add(rc16);
        TypeQuestionRC rc17 = new TypeQuestionRC(new Question("animal",3,"Qu’elle est la couleur de la peau de l’ourse blanc ?","noir"));
        RC.add(rc17);
        TypeQuestionRC rc18 = new TypeQuestionRC(new Question("animal",3,"Combien de mettre un nid de termite peux avoir ?","5"));
        RC.add(rc18);

        //Sport
        TypeQuestionRC rc19 = new TypeQuestionRC(new Question("sport",1,"Qu’elle est la durée d’un match de foot ?","90"));
        RC.add(rc19);
        TypeQuestionRC rc20 = new TypeQuestionRC(new Question("sport",1,"Combien y-a-t-il de joueur dans une equipe de basket ?","5"));
        RC.add(rc20);
        TypeQuestionRC rc21 = new TypeQuestionRC(new Question("sport",1,"Combien de joueur est sur le terrain dans le foot ?","11"));
        RC.add(rc21);

        TypeQuestionRC rc22 = new TypeQuestionRC(new Question("sport",2,"Qui a gagner le plus de ballon dors dans l’histoire du football ?","Lionel Messi"));
        RC.add(rc22);
        TypeQuestionRC rc23 = new TypeQuestionRC(new Question("sport",2,"Qu’elle est la date de la 1er coupe du monde ?","13/07/1930"));
        RC.add(rc23);
        TypeQuestionRC rc24 = new TypeQuestionRC(new Question("sport",2,"De qu’elle sport provient le mot strike ?","bowling"));
        RC.add(rc24);


        TypeQuestionRC rc25 = new TypeQuestionRC(new Question("sport",3,"Combien ya t-il de periode au hockey sur galce ?","3"));
        RC.add(rc25);
        TypeQuestionRC rc26 = new TypeQuestionRC(new Question("sport",3,"En quelle année les femme on été autorisé a jouer au jeux olympique ?","1900"));
        RC.add(rc19);
        TypeQuestionRC rc27 = new TypeQuestionRC(new Question("sport",3,"Que signigie NBA ?","national basket association"));
        RC.add(rc27);

//cultureG
        TypeQuestionRC rc28 = new TypeQuestionRC(new Question("cultureG",1,"Qui dirige l’urss apres la 2nd guerre mondial ?","Staline"));
        RC.add(rc28);
        TypeQuestionRC rc29 = new TypeQuestionRC(new Question("cultureG",1,"A qu’elle temperature l’eau bouilli ?","100 "));
        RC.add(rc29);
        TypeQuestionRC rc30 = new TypeQuestionRC(new Question("cultureG",1,"Qu’elle est la scentifique gagner 2 prix nobel dans 2 matier differente ?","Marie curry"));
        RC.add(rc30);

        TypeQuestionRC rc31 = new TypeQuestionRC(new Question("cultureG",2,"Qu’elle la derive de u/v ?","(u’v-v’u)/v^2"));
        RC.add(rc31);
        TypeQuestionRC rc32 = new TypeQuestionRC(new Question("cultureG",2,"Qui est le 40eme president des etat-unis ?","Reagan"));
        RC.add(rc32);
        TypeQuestionRC rc33 = new TypeQuestionRC(new Question("cultureG",2,"Qu’elle est le premier homme  a être aller sur la lune ?","Neil Armstrong"));
        RC.add(rc33);

        TypeQuestionRC rc34 = new TypeQuestionRC(new Question("cultureG",3,"Qui est le roi soleil ?","louis XIV"));
        RC.add(rc34);
        TypeQuestionRC rc35 = new TypeQuestionRC(new Question("cultureG",3,"Qu’elle journal a était victime d’un attentat en Janvier 2015 ?","charlie hebdo"));
        RC.add(rc35);
        TypeQuestionRC rc36 = new TypeQuestionRC(new Question("cultureG",3,"Qui a dit cette citation « L’homme est un loup pour l’homme » ?","plaute"));
        RC.add(rc36);




//Voiture
        TypeQuestionRC rc37 = new TypeQuestionRC(new Question("voiture",1," Pour qu’elle marcher la voiture la moins cher au monde est destinée ?","inde"));
        RC.add(rc37);
        TypeQuestionRC rc38 = new TypeQuestionRC(new Question("voiture",1," Qu’elle est la voiture la plus cher au monde ?","Rolls-Royce Boat Tail"));
        RC.add(rc38);
        TypeQuestionRC rc39 = new TypeQuestionRC(new Question("voiture",1," Le marché de l’automobile le plus rentable est ?","Occasion"));
        RC.add(rc39);

        TypeQuestionRC rc40 = new TypeQuestionRC(new Question("voiture",2," Qu’elle est le modelé de voiture le plus volée en France ?","clio 4 "));
        RC.add(rc40);
        TypeQuestionRC rc41= new TypeQuestionRC(new Question("voiture",2," qu’elle est la marque de la 2 chevaux ?","Citroen"));
        RC.add(rc41);
        TypeQuestionRC rc42 = new TypeQuestionRC(new Question("voiture",2," Qu'elle est le prix de la voiture la moins cher au monde","1600"));
        RC.add(rc42);

        TypeQuestionRC rc43 = new TypeQuestionRC(new Question("voiture",3," a combien de kilometre/h la voiture la rapide du monde va?","420"));
        RC.add(rc43);
        TypeQuestionRC rc44 = new TypeQuestionRC(new Question("voiture",3," Qu'elle est le premier model crée par ford","ford T"));
        RC.add(rc44);
        TypeQuestionRC rc45 = new TypeQuestionRC(new Question("voiture",3," Qu'elle est le premier modele de la citroen","torpéde 10 HP"));
        RC.add(rc45);


//rap


        TypeQuestionRC rc46 = new TypeQuestionRC(new Question("rap",1,"Quand le rap est-il arrivé en France ?","1990"));
        RC.add(rc46);
        TypeQuestionRC rc47 = new TypeQuestionRC(new Question("rap",1,"Qui chante « Maman ne le sait pas » ?","Ninho et niska"));
        RC.add(rc47);
        TypeQuestionRC rc48 = new TypeQuestionRC(new Question("rap",1,"Qui chante le titre Qui est l’exemple ?","Rohff"));
        RC.add(rc48);

        TypeQuestionRC rc49 = new TypeQuestionRC(new Question("rap",2,"Qu’elle est le rappeur qu’on surnomme le « duc de boulogne » ?","booba"));
        RC.add(rc49);
        TypeQuestionRC rc50 = new TypeQuestionRC(new Question("rap",2,"Qui est l’auteur du tube je dance avec le mia ?","Iam"));
        RC.add(rc50);
        TypeQuestionRC rc51 = new TypeQuestionRC(new Question("rap",2,"De qui est composé le groupe psy 4 de la rime ?","Soprano , Alonzo Sya Style et vincenzo"));
        RC.add(rc51);

        TypeQuestionRC rc52 = new TypeQuestionRC(new Question("rap",3,"Qu’elle est le rappeur qui sort « La lune ne sera pas toujour pleine,mon cœur ne sera pas toujour vide ?","pnl"));
        RC.add(rc52);
        TypeQuestionRC rc53 = new TypeQuestionRC(new Question("rap",3,"Comment s’appelle le premier album de pnl ?","que la famille"));
        RC.add(rc53);
        TypeQuestionRC rc54 = new TypeQuestionRC(new Question("rap",3,"Combien d’album a fait ninho ?","3"));
        RC.add(rc54);



        //serie


        TypeQuestionRC rc55 = new TypeQuestionRC(new Question("serie",1,"Qu’elle est la serie sortie sur netflix qui a battue des record d’audience ?","Skip game"));
        RC.add(rc55);
        TypeQuestionRC rc56 = new TypeQuestionRC(new Question("serie",1,"Qu’elle serie met en avant le cartel de drogue ?","narcos"));
        RC.add(rc56);
        TypeQuestionRC rc57 = new TypeQuestionRC(new Question("serie",1,"Qu’elle anime Netflix a decidé d’adapter en live Action ?","One piece"));
        RC.add(rc57);


        TypeQuestionRC rc58 = new TypeQuestionRC(new Question("serie",2,"Qui était Gossip Girl ?","Dan Humphrey"));
        RC.add(rc58);
        TypeQuestionRC rc59 = new TypeQuestionRC(new Question("serie",2,"Combien y-a-t-il de saison dans des Simpson ?","32"));
        RC.add(rc59);
        TypeQuestionRC rc60 = new TypeQuestionRC(new Question("serie",2,"Qu’elle est la série ou un braquage a lieu en espagnol ?","casa de papel"));
        RC.add(rc60);

        TypeQuestionRC rc61 = new TypeQuestionRC(new Question("serie",3,"Qu’elle série lancée en 2013 est connue pour etre la 1er série netflix ?","house of cards"));
        RC.add(rc61);
        TypeQuestionRC rc62 = new TypeQuestionRC(new Question("serie",3,"Comment se nomme l’hopital dans gray’s Anatomy ?","seatle Grace"));
        RC.add(rc62);
        TypeQuestionRC rc63 = new TypeQuestionRC(new Question("serie",3,"Comment s’appelle l’acteur qui joue joe dans you ?","Penn Badgley"));
        RC.add(rc63);

//histoire
        TypeQuestionRC rc64 = new TypeQuestionRC(new Question("histoire",1,"Quand début la 1er guerre mondial ?","1914"));
        RC.add(rc64);
        TypeQuestionRC rc65 = new TypeQuestionRC(new Question("histoire",1,"En qu’elle année Hitler deviens-t-il le 3eme Reich ?","1933"));
        RC.add(rc65);
        TypeQuestionRC rc66 = new TypeQuestionRC(new Question("histoire",1,"Ou sont jugée les nazis ?"," Nuremberg"));
        RC.add(rc66);

        TypeQuestionRC rc67 = new TypeQuestionRC(new Question("histoire",2,"A qu’elle date débute la solution final ?","Janvier 1942"));
        RC.add(rc67);
        TypeQuestionRC rc68 = new TypeQuestionRC(new Question("histoire",2,"Qu’elle est le régime de l’URSS ?","COMMUNISME"));
        RC.add(rc68);
        TypeQuestionRC rc69 = new TypeQuestionRC(new Question("histoire",2,"Comment on nommer louis XIV ?","Le roi soleil"));
        RC.add(rc69);

        TypeQuestionRC rc70 = new TypeQuestionRC(new Question("histoire",3,"Quand Jules-cesar est-il née ?"," 100 avant J-c"));
        RC.add(rc70);
        TypeQuestionRC rc71 = new TypeQuestionRC(new Question("histoire",3,"Quel titre portrait Franco en 1975 ?","Caudillo"));
        RC.add(rc71);
        TypeQuestionRC rc72 = new TypeQuestionRC(new Question("histoire",3,"Qui est le 1er dictateur de la corée deu nord ?","Kim II-SONG"));
        RC.add(rc72);
//film
        TypeQuestionRC rc73 = new TypeQuestionRC(new Question("film",1,"Comment s’appelle le personnage principal de Harry Potter ?","Harry Potter"));
        RC.add(rc73);
        TypeQuestionRC rc74 = new TypeQuestionRC(new Question("film",1,"Qu’elle est le nom u film ou un bateau coule ?","titanic"));
        RC.add(rc74);
        TypeQuestionRC rc75 = new TypeQuestionRC(new Question("film",1,"Qu’elle est le film avec comme acteur principal Leonardo DiCaprio et Kate Winslet ?","titanic"));
        RC.add(rc75);

        TypeQuestionRC rc76 = new TypeQuestionRC(new Question("film",2,"Combien y-a-t-il de fast and furious ?","9"));
        RC.add(rc76);
        TypeQuestionRC rc77 = new TypeQuestionRC(new Question("film",2,"Qui double Scar dans le roi lion dans la vf ?","Jean piat"));
        RC.add(rc77);
        TypeQuestionRC rc78 = new TypeQuestionRC(new Question("film",2,"D’où vient la Chanson « hakuna Matata » ?","le roi lion"));
        RC.add(rc78);

        TypeQuestionRC rc79 = new TypeQuestionRC(new Question("film",3,"En qu’elle année est sortie le 1er film Disney ?","1928"));
        RC.add(rc79);
        TypeQuestionRC rc80 = new TypeQuestionRC(new Question("film",3,"Qu’elle est le r éalisateur du «  monde de nemo »","Andrew stanton"));
        RC.add(rc80);
        TypeQuestionRC rc81 = new TypeQuestionRC(new Question("film",3,"Qui est le réealisateur de Jurassic Park ?","Steven Spielberg"));
        RC.add(rc81);


        //francais
        TypeQuestionRC rc82 = new TypeQuestionRC(new Question("francais",1,"« Ce n’est pas moi qui suis inquiéte pour les filles, c’est lui » Qu’elle est l’adjectif qualificatif ?","Inquiéte"));
        RC.add(rc82);
        TypeQuestionRC rc83 = new TypeQuestionRC(new Question("francais",1,"Si l’adjectif est mal accordé dans a la phrase suivante donnée le mot ou il y a une erreur « Nous avons planté un bel arbre dans le jardin »","bel"));
        RC.add(rc83);
        TypeQuestionRC rc84 = new TypeQuestionRC(new Question("francais",1,"L’adjectif qualificatif s’accorde avec quoi ?","nom"));
        RC.add(rc84);


        TypeQuestionRC rc85 = new TypeQuestionRC(new Question("francais",2,"Qu’elle est COD de la phrase suivant « J’ai vu un écureuil sur le sapin en face de la maison »","un ecureuil"));
        RC.add(rc85);
        TypeQuestionRC rc86 = new TypeQuestionRC(new Question("francais",2,"Qu’elle est COI de la phrase suivant « le guide parla au randonneurs pour les rassurer »","aux randonneurs"));
        RC.add(rc86);
        TypeQuestionRC rc87 = new TypeQuestionRC(new Question("francais",2,"Qu’elle est COD de la phrase suivant « l’enfant a englouti le gâteau sans en proposer à ses amis»","gâteau"));
        RC.add(rc87);

        TypeQuestionRC rc88 = new TypeQuestionRC(new Question("francais",3,"« Elle c’est rendu compte de son erreur »Qu’elle est l’erreur","erreur"));
        RC.add(rc88);
        TypeQuestionRC rc89 = new TypeQuestionRC(new Question("francais",3,"« il doit nous versé des acompte pour la semaine prochaine » Qu’elle est l’eureur","verser"));
        RC.add(rc89);
        TypeQuestionRC rc90 = new TypeQuestionRC(new Question("francais",3,"« on doit aller tout devant »Qu’elle est l’erreur.","tous"));
        RC.add(rc90);





        //possibilité pour le joueur de voir toutes les questions

        System.out.println("Souhaitez-vous voir toutes les questions du jeu ? (oui ou non)");
        Scanner st = new Scanner(System.in);
        String voirQuestion = st.nextLine();
        if(voirQuestion.equals("oui")){
            System.out.println("Voici toutes les questions QCM du jeu associées au thème de la question");

            for(int j=0; j< QCM.size();j++){
                System.out.println("THÈME DE LA QUESTION : "+QCM.get(j).getClQuestion().getTheme()+"  ; DE DIFFICULTÉ :"+QCM.get(j).getClQuestion().getDifficulte()+" ; QUESTION : "+QCM.get(j).getClQuestion().getQuest());
            }
            System.out.println("Voici toutes les questions VF du jeu associées au thème de la question");
            for(int u=0; u< VF.size();u++){
                System.out.println("THÈME DE LA QUESTION : "+VF.get(u).getClQuestion().getTheme()+"  ; DE DIFFICULTÉ :"+QCM.get(u).getClQuestion().getDifficulte()+" ; QUESTION : "+VF.get(u).getClQuestion().getQuest());
            }
            System.out.println("Voici toutes les questions RC du jeu associées au thème de la question");
            for(int v=0; v< RC.size();v++){
                System.out.println("THÈME DE LA QUESTION : "+RC.get(v).getClQuestion().getTheme()+"  ; DE DIFFICULTÉ :"+QCM.get(v).getClQuestion().getDifficulte()+" ; QUESTION : "+RC.get(v).getClQuestion().getQuest());
            }
        }

        //Début du jeu
        System.out.println(JoueursSelectionnes.get(0).getNom() +" , pour débuter le jeu appuyer sur entrée");
        Scanner st1 = new Scanner(System.in);
        String debuter = st1.nextLine();






        //Lecture phase 1
        Phase1 p1 =new Phase1(JoueursSelectionnes,QCM,VF,RC,listTheme);
        List<Joueur> joueurPhase2 = p1.deroulerPhaseJeu();
        //Lecture phase 2
        Phase2 p2 = new Phase2(joueurPhase2,QCM,VF,RC,listTheme);
        List<Joueur> joueurPhase3 = p2.deroulerPhaseJeu();
        //Lecture phase 3
        Phase3 p3 = new Phase3(joueurPhase3,QCM,VF,RC,listTheme);
        List<Joueur> joueurGagnant = p3.deroulerPhaseJeu();


        //Possibilité de rejouer au jeu
        System.out.println("Souhaitez-vous rejouer avec les mêmes pseudos?");
        Scanner st2=new Scanner(System.in);
        String rejouer=st2.nextLine();

        while(rejouer.equals("oui")){
            Phase1 p11 =new Phase1(JoueursSelectionnes,QCM,VF,RC,listTheme);
            List<Joueur> joueurPhase22 = p11.deroulerPhaseJeu();
            Phase2 p22 = new Phase2(joueurPhase22,QCM,VF,RC,listTheme);
            List<Joueur> joueurPhase33 = p22.deroulerPhaseJeu();
            Phase3 p33 = new Phase3(joueurPhase33,QCM,VF,RC,listTheme);
            List<Joueur> joueurGagnant1 = p33.deroulerPhaseJeu();

        }















/*


        System.out.println("Chaque joueur aura 3 questions. \nA l'issue de cette phase 1 seuls les trois meilleurs joueurs seront selectionnés. \nPar contre, si il y a une égalité les joueurs seront départagés par une question et le plus rapide participera à la phase 2. \nLe jeu va commencer.");
        int rangQuestion;
        String themePourJoueur;
        String themeQ;
        String reponseJoueur;
        int i=0;
        themePourJoueur=listTheme.get(i);
        System.out.println(JoueursSelectionnes.get(i)+" c'est à votre tour de jouer");
        System.out.println("Vous allez jouer sur le thème : "+themePourJoueur);
        Random rand = new Random();
        rangQuestion= rand.nextInt(QCM.size());
        themeQ = QCM.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur){
            Random rd = new Random();
            rangQuestion=rd.nextInt(QCM.size());
            themeQ = QCM.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println(QCM.get(rangQuestion).getClQuestion().getQuest());
        System.out.println(QCM.get(rangQuestion).getChoix1());
        System.out.println(QCM.get(rangQuestion).getChoix2());
        System.out.println(QCM.get(rangQuestion).getChoix3());
        System.out.println("Donner votre réponse");
        Scanner scan = new Scanner(System.in);
        reponseJoueur=scan.nextLine();
        if(reponseJoueur.equals(QCM.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        System.out.println("La réponse était : "+QCM.get(rangQuestion).getClQuestion().getReponse());

        QCM.remove(rangQuestion);

        Random rando = new Random();
        rangQuestion= rando.nextInt(RC.size());
        themeQ= RC.get(rangQuestion).getClQuestion().getTheme();
        while(themeQ != themePourJoueur || 1!=RC.get(rangQuestion).getClQuestion().getDifficulte()){
            Random rad = new Random();
            rangQuestion=rad.nextInt(RC.size());
            themeQ = RC.get(rangQuestion).getClQuestion().getTheme();
        }
        System.out.println(RC.get(rangQuestion).getClQuestion().getQuest());
        System.out.println("Donner votre réponse");
        Scanner scann = new Scanner(System.in);
        reponseJoueur=scann.nextLine();
        if(reponseJoueur.equals(RC.get(rangQuestion).getClQuestion().getReponse())){
            JoueursSelectionnes.get(i).majScore(2);
            System.out.println("Bravo vous avez gagné 2 points. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        else{
            System.out.println("Vous n'avez pas gagné de point. \nVotre score total est de : "+JoueursSelectionnes.get(i).getScore());
        }
        System.out.println("La réponse était : "+RC.get(rangQuestion).getClQuestion().getReponse());
        RC.remove(rangQuestion);



 */

    }
}

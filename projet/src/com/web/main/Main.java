package com.web.main; 

import com.web.data.*;
import com.web.tree.*;
import java.util.Scanner; 
import java.util.Map; 
import java.util.HashMap; 
import java.io.*;


public class Main{
	public static void main(String agrs[]) {	
		Map<String, FeuilleDeRoute> dataBase = new HashMap(); // path to file_name 
		
		FeuilleDeRoute f000 = new FeuilleDeRoute("Union European", 4);  // les feuilles de route possible 
		FeuilleDeRoute f001 = new FeuilleDeRoute("Etranger", 4);
		FeuilleDeRoute f010 = new FeuilleDeRoute("CDI", 4);
		FeuilleDeRoute f011 = new FeuilleDeRoute("CDD", 4);
		FeuilleDeRoute f100 = new FeuilleDeRoute("1 ans", 4);
		FeuilleDeRoute f101 = new FeuilleDeRoute("2 ans", 4);
		FeuilleDeRoute f110 = new FeuilleDeRoute("Seul", 4);
		FeuilleDeRoute f111 = new FeuilleDeRoute("Famille", 4);
		
		
		
		f000.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f000.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f000.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f000.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		
		f001.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f001.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f001.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f001.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		
		f010.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f010.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f010.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f010.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		f011.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f011.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f011.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f011.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		f100.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f100.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f100.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f100.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		f101.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f101.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f101.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f101.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		f110.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f110.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f110.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f110.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		
		f111.setChapterByIndex("Demande Visa :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"    ", 0,0 );
		
		f111.setChapterByIndex("Recherche Logement :", "À votre arrivée en France, vous devrez présenter différents documents lors de vos démarches administratives.\r\n" + 
				"• Munissez-vous bien des documents originaux,\r\n" + 
				"photocopiez tous les documents et Prconcvuersrezzd-evs voeurssionvsotre CEA\r\n" + 
				"numériques.\r\n" + 
				"• Certains documents doivent être apostillés ou légalisés ainsi que traduits avant votre départ en France.\r\n" + 
				"Rechercher un logement\r\n" + 
				" \r\n" + 
				"Plus sur la légalisation, l'apos\r\n" + 
				"tille et la traduction de vos docu ments\r\n" + 
				"Liste des documents fortement co nseillés\r\n" + 
				"Selon l’école où vous serez inscrit, un logement peut vous être réservé d’office. Contactez les services de votre établissement pour plus de renseignements.\r\n" + 
				"Pour plus de renseignements sur la recherche de logement, consultez nos pages web.\r\n" + 
				"Délais :\r\n" + 
				"0 à 2 mois\r\n" + 
				"      \r\n" + 
				"Site web du CROUS de Paris\r\n" + 
				" Etudiant : commencez votre recherche de logement au plus vite\r\n" + 
				"L’idéal pour vous est de trouver un logement définitif avant votre arrivée en France. Si vous préférez visiter votre logement et découvrir son environnement avant de vous y installer, vous avez la possibilité de réserver un hébergement provisoire.\r\n" + 
				"Si vous êtes étudiant-e vous pouvez contacter :\r\n" + 
				"•Héberjeunes, un service dédié au logement des étudiants, stagiaires, jeunes salariés et doctorants, situé dans les locaux de l’Université Paris- Sud.\r\n" + 
				"   ", 2, 1);
		f111.setChapterByIndex("Inscription :", "Inscription\r\n" + 
				"!\r\n" + 
				" Faire soninscription\r\n" + 
				"Délais : 0 mois\r\n" + 
				"Etudiant : faites vos inscriptions administrative et pédagogique\r\n" + 
				"", 0, 2);
		f111.setChapterByIndex("Couverture Sociale", "Vous devez vous affilier à la sécurité sociale à travers le portail\r\n" + 
				"etudiant-etranger.ameli.fr (disponible à partir du 1er septembre 2018).\r\n" + 
				"Des pièces justificatives vous seront demandées.\r\n" + 
				"Pensez à prendre une assurance complémentaire pour être mieux remboursé (voir liens ci-contre).\r\n" + 
				" ", 0, 3);
		
		// creation de feuille de route avec des simples retour init    V.0
		/*f001.setChapterByIndex("Visa",     "Bienvenu cher salarie", 2, 0);
		f001.setChapterByIndex("Logement", "Les logement pour les salariés sont elligible a des demandes d'aide. merci de vous approcher à la CAF", 2, 1);
		
		f010.setChapterByIndex("Visa",      "Bienvenu cher doctorant", 2, 0);
		f010.setChapterByIndex("Logement",  "Les doctorants sont hebergé par les centres de recherches", 2, 1);
		
		f011.setChapterByIndex("Visa",      "Bienvenu cher chercheur", 2, 0);
		f011.setChapterByIndex("Logement",  "Les chercheurs ont des logements gratuits", 2, 1);
		
		
		f100.setChapterByIndex("Visa",     "Bonjour cher etudiant", 2, 0);  // a évoluer 
		f100.setChapterByIndex("Logement", "La recherche de logement des etudiants doit se faire rapidement", 2, 1);
		
		f101.setChapterByIndex("Visa",     "Bonjour cher etudiant", 2, 0);  // a évoluer 
		f101.setChapterByIndex("Logement", "La recherche de logement des etudiants doit se faire rapidement", 2, 1);
		
		f110.setChapterByIndex("Visa",     "Bonjour cher etudiant", 2, 0);  // a évoluer 
		f110.setChapterByIndex("Logement", "La recherche de logement des etudiants doit se faire rapidement", 2, 1);
		
		f111.setChapterByIndex("Visa",     "Bonjour cher etudiant", 2, 0);  // a évoluer 
		f111.setChapterByIndex("Logement", "La recherche de logement des etudiants doit se faire rapidement", 2, 1);*/
		
	
	
		dataBase.put("000", f000);  //Put de feuille de route 
		dataBase.put("001", f001);
		dataBase.put("010", f010);
		dataBase.put("011", f011);
		dataBase.put("100", f100);
		dataBase.put("101", f101);
		dataBase.put("110", f110);
		dataBase.put("111", f111);
		

		
		for(String key : dataBase.keySet()) {
			FeuilleDeRoute crr = dataBase.get(key);
			String title = crr.getTitle(); 
			BufferedWriter writer = null;
			try
			{
			    writer = new BufferedWriter( new FileWriter("/Users/mac/Desktop/" + title + ".txt")); //remplacer le chemin par défaut 
			    writer.write(crr.display() + "\n\n");

			}
			catch ( IOException e)
			{
			}
			finally
			{
			    try
			    {
			        if ( writer != null)
			        writer.close( );
			    }
			    catch ( IOException e)
			    {
			    }
			}
		}
		
		Scanner sc = new Scanner(System.in);  // scanner (permet de lire les entrées du clavier ) 
		Tree dt = new Tree(); 
		
		String level = "Start"; 
		
		String level_0 = "Premier Fois "; 
		String level_00 = "Etudiant";
		String level_01 = "Salarie"; 
		
		String level_1 = "Renouvelloment"; 
		String level_10 = "Carte Séjour";
		String level_11 = "Passeport Talent";
		
		String level_000 = "UE";            
		
		String level_001 = "Etranger";        
		
		String level_010 = "CDI";            
		 
	    String level_011 = "CDD";            
	     
	    String level_100 = "1 ans";        
	    
	    String level_101 = "2 ans ";        
	    
	    String level_110 = "Seul";          
	    
	    String level_111 = "Famille";         
	    
	    			

		
		dt.addItem(level, "");
		
		dt.addItem(level_0, "0");
		dt.addItem(level_00, "00");
		dt.addItem(level_01, "01");
		
		
		dt.addItem(level_1, "1");
		dt.addItem(level_10, "10");
		dt.addItem(level_11, "11");
		
		dt.addItem(level_000, "000");  
		
		dt.addItem(level_001, "001");  
		
		dt.addItem(level_010, "010");
		
		dt.addItem(level_011, "011");
		
		dt.addItem(level_100, "100");
		
		dt.addItem(level_101, "101");
		
		dt.addItem(level_110, "110");

		dt.addItem(level_111, "111");
		
		
		
		dt.display(); // affichage de l'arbre aprés la creation 
		
		
		System.out.println("");
		
		boolean keepProcessing = true; 
		int levelProcess = 0; 
		String path = ""; 
		String currentChoice = "";
		
		while(keepProcessing) {
			if(levelProcess == 0) {
				String title = dt.getData(path);
				System.out.println(title);
				sc.nextLine(); 
				System.out.println(dt.getData("0") + "   " + dt.getData("1"));
				System.out.println("Merci de choisir entre ces deux choix 0:gauche, 1:droite");
				int choix = sc.nextInt(); 
				if (choix == 0) {
					currentChoice = "0";
				}
				else if(choix == 1) {
					currentChoice = "1";
				}
			}
			else {
				String childs = dt.computeNewChild(path, currentChoice); 
				path += currentChoice; 
				System.out.println(childs);
				System.out.println("Merci de choisir entre ces deux choix 0:gauche, 1:droite");
				int choix = sc.nextInt(); 
				if (choix == 0) {
					currentChoice = "0";
				}
				else if(choix == 1) {
					currentChoice = "1";
				}
				
			}
			levelProcess++; 
			keepProcessing = levelProcess != 3;
		}
		sc.close();
		
		
				
		System.out.println("");
		System.out.println("Merci de bien valider votre choix :");
		System.out.println("Fin des traitements, votre choix est : " + path + currentChoice);  
		System.out.println("");
		System.out.println("Votre feuille de route : \n" + dataBase.get(path + currentChoice).display());
		
	}
}
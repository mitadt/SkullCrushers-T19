import java.io.BufferedReader;
import java.lang.*;
import java.io.*;
class medican
{
  public static void main(String arg[]) throws IOException
   {
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader (ir);
    int a[] = new int[20];
    int b[] = new int[20];
    int c[] = new int[20];
    int d[] = new int[20];
    int e[] = new int[20];
    int z[] = new int[20];
    int x,i,swap;
    System.out.println("<-<-<-<-<-<-<-<-<-select name of disease->->->->->->->->->");
    System.out.println("     enter 1 for HIV/AIDS");
    System.out.println("     enter 2 for CANCER");
    System.out.println("     enter 3 for HEART ATTACK");
    System.out.println("     enter 4 for JAUNDICE ");
    System.out.println("     enter 5 for ASTHMA ");
    System.out.println("     enter 6 for CHICKEN POX");
    System.out.println("     enter 7 for DENGUE");
    System.out.println("     enter 8 for INFLUENGA(The FLU) ");
    System.out.println("     enter 9 for EBOLA ");
    System.out.println("     enter 10 for SWINE FLU");
    System.out.println("     enter 11 for TYPHOID ");
    System.out.println("     enter 12 for MALARIA ");
    System.out.println("     enter 13 for MEASLES");
    System.out.println("     enter 14 for AMOEBIASIS");
    System.out.println("     enter 15 for MARASMUS");
    System.out.println("     enter 16 for STOMACH ULCERS");
    System.out.println("     enter 17 for BROCHIECTASIS");
    System.out.println("     enter 18 for PNEUMONIA");
    System.out.println("     enter 19 for ISCHAEMIC HEART DISEASES");
    System.out.println("     enter 20 for CEREBROVASCULAR DIESEASE");
    System.out.println("     enter your choice");
    x = Integer.parseInt(br.readLine());
    switch(x)
    {
     case 1:
           System.out.println("HUMAN IMMUNODEFFICIENCY VIRUS(HIV)\n\nSYMPTOM :\n•	 Being tired all of the time.\n•	 Swollen lymph nodes in your neck or groin.\n•  	Fever that lasts for more than 10 days.\n•	 Night sweats.\n•	 Unexplained weight loss.\n•	 Purplish spots on your skin that don't go away\n");

           System.out.println("\nTREATMNET :\n Antiretroviral therapy (ART) is the use of HIV medicines to treat HIV infection.\n People on ART take a combination of HIV medicines (called an HIV treatment regimen) every day.\n ART is recommendedfor everyone who has HIV.\n\n");
           System.out.println("•	TDF (tenofovir)\n•	either 3TC (lamivudine) or FTC (emtricitabine)\n•	and EFV (efavirenz).\n\n");
     break;


     case 2:
           System.out.println("\nCANCER:\nSymptoms :\n  Early symptoms of cancer in men include:\n•	bowel changes.\n•	rectal bleeding.\n•	urinary changes.\n•	blood in urine\n•	persistent back pain.\n•	unusual coughing.\n•	testicular lumps.\n•	excessive fatigue.\n");

           System.out.println("\nTreatment : \n•	Surgery\n•	Chemotherapy\n•	Hormone Therapy\n•	Stem Cell Transplant\n•	Precision Pills\n\n");
     break;

     case 3:
       
           System.out.println("\nHEART ATTACK\nSymptoms:\n•	Pressure, tightness, pain, or a squeezing or aching sensation in your chest or arms that may spread to your neck, jaw or back.\n•	Nausea, indigestion, heartburn or abdominal pain.\n•	Shortness of breath.\n•	Cold sweat.\n•	Fatigue.\n•	Lightheadedness or sudden dizziness.\n");

           System.out.println("\nTreatment :\nSupportive care\nDefibrillation and Oxygen therapy\nMedications\nBlood Thinners, Heart Medication, Narcotic, Beta blocker, Statin, and ACE inhibitor\nMedical procedure\nCoronary stent and Coronary angioplasty\nTherapies\nCardiac rehabilitation\nSurgery\nCoronary artery bypass surgery\n\n");
     break;
     
     case 4:
           System.out.println("\nJAUNDICE\n Symptoms:\n•	fatigue.\n•	abdominal pain.\n•	weight loss.\n•	vomiting.\n•	fever.\n•	pale stools.\n•	dark urine.\n");
           System.out.println("\nTreatment :\n1.	Light therapy (phototherapy). Your baby may be placed under a special lamp that emits light in the blue-green spectrum. ....\n2.	Intravenous immunoglobulin (IVIg). ...\n3.	Exchange transfusion.\n\n");
     break;
     
     case 5:
             System.out.println("\nASTHMA\nSymptoms :\n•	Shortness of breath.\n•	Chest tightness or pain.\n•	Trouble sleeping caused by shortness of breath, coughing or wheezing.\n•	A whistling or wheezing sound when exhaling.\n");


            System.out.println("\nTreatment :\nSelf care\nThere’s no cure for asthma, but most people can control their asthma well and live healthy lives.\nMedicine from inhalers (puffers) is the main treatment – but there are other ways to help keep yourself well.\n•	Know what triggers your asthma and do your best to avoid those things.\n•	Take your medicine exactly as instructed by your doctor.\n•	Be prepared – know how to recognise symptoms, and what to do in an emergency.\n•	Talk to your doctor about an asthma self-management plan – make sure you follow it.\n•	Get vaccinated against the flu each year.\n\n");
        break;
     case 6:
            System.out.println("\nCHICKEN POX :\nSymptoms :\nPeople with chickenpox have small blisters (like a rash) on their skin.\nThese can be very itchy.Other symptoms of chickenpox are:\n•	tiredness\n•	fever\n•	general aches and pains.\n");
            System.out.println("\nTreatment :\n•	ake a lukewarm bath every 3–4 hours for the first few days. Add 4 tablespoons of baking soda, cornstarch or oatmeal to the water. Use soap in one of the baths each day to clean bacteria off your skin.\n•	Use calamine lotion on the chickenpox sores to help relieve itching.\n•	Put a towel-covered ice pack or cool, moist washcloth on itchy areas for 20–30 minutes. (Don’t share the towel or washcloth with anyone else.)\n•	If the itching is severe or is making it hard to sleep, take an antihistamine.\n•	Trim your fingernails and wash your hands often to prevent the rash from becoming infected if you scratch it.\n•	Take a pain reliever such as paracetamol for headache, fever or general aches and pains.\n\n");
        break;
      case 7:
            System.out.println("\nDENGUE :\nSymptoms :\n  Dengue symptoms can last from 2–7 days and may include:\n•	a sudden fever\n•	an intense headache (especially behind the eyes)\n•	muscle and joint pain\n•	feeling very tired\n•	nausea/ vomiting\n•	a skin rash.\n");
            System.out.println("\nTreatment :\nSupportive care\nFluid Replacement,Oral Rehydration Therapy,IV Fluids\nMedications\nAnalgesics\n\n");
      break;
      case 8:
      
            System.out.println("\nINFLUENGA(The FLU) : \nSymptoms :\n•	Fever\n•	Chills\n•	Muscle Aches\n•	Cough\n•	Congestion\n•	Runny nose\n•	Headache\n•	Fatigue\n");
            System.out.println("\nTreatment :\n•	Supportive care\n•	Annual vaccine\n•	Paracetamol\n•	Non Steroidal Anti Inflammatory Drugs\n•	Analgesic\n\n");
      break;
      case 9:
      
            System.out.println(" \n EBOLA :\nSymptoms :\n•	Internal Bleeding\n•	Coughing Blood\n•	Chest pain\n•	Eye Redness\n•	Mental confusion\n•	Red spot on skin\n");

            System.out.println("\nTreatment :\n•	Oxygen Therapy\n•	IV Fluids\n•	Blood Transfusion\n\n");
      break;
      case 10:
    
            System.out.println("\nSWINE FLU :\nSymptoms :\n•	Muscle Pain\n•	Dry Cough\n•	Diarrhoea\n•	Nausea\n•	Fatigue\n•	Shortness of Breath\n");

           System.out.println("\n Treatment :\n•	Antiviral drug\n•	Decongestant\n•	Analgesic\n•	Fluid Replacement\n\n");
      break;
  
      case 11:
           System.out.println("\nTYPHOID :\nSymptoms :\nPain areas: in the abdomen or muscles\nGastrointestinal:\n   bloating, constipation, diarrhoea, nausea, or vomiting\nWhole body:\n   fatigue, fever, chills, loss of appetite, or malaise\nAlso common:\n   headache, muscle weakness, rash with small red dots, skin rash, or weight loss\n");

           System.out.println("\nTreatment :\nSupportive care :\nIV fluids and Oral rehydration therapy\n\nMedications :\nAntibiotics and Penicillin antibiotic\n\n");
      break;
    
      case 12:
           System.out.println("\nMALARIA :\nSymptoms :\nPain areas:   in the abdomen or muscles\nWhole body:   chills, fatigue, fever, night sweats, shivering, or sweating\nGastrointestinal:\n   diarrhoea, nausea, or vomiting\nAlso common:\n   fast heart rate, headache, mental confusion, or pallor\n");

           System.out.println("\nTreatment :\n  Medications\n  Anti-Parasite and Antibiotics.\n\n");
      break;
      case 13:
           System.out.println("\nMEASLES :\nSymptoms :\nPain areas:\n   in the muscles\nWhole body:\n   fever, malaise, fatigue, or loss of appetite\nNasal:\n  runny nose or sneezing\nAlso common:\n   skin rash, dry cough, pink eye, diarrhoea, headache, koplik's spots, sensitivity to light, sore throat, or swollen lymph nodes.\n");

           System.out.println("\nTreatment :\nPreventative\nMMR vaccine\nMedications\nAnalgesic.\n\n");
      break;
      case 14:
           System.out.println("\nAMOEBIASIS :\nSymptoms :\nPain areas:\n  in the abdomen\nGastrointestinal:\n  blood in stool, diarrhoea, or flatulence\nWhole body:\n  fatigue, fever, or loss of appetite.\nAlso common:\n  weight loss.\n");

           System.out.println("\nTreatment :\nMedications\nAntibiotics and Anti-Parasite\nPreventative\nHygiene\nSupportive care\nOral rehydration therapy\n\n");
       break;
      
       case 15:
    	   System.out.println("\n MARASMUS :\nSymptoms :\nchronic diarrhea\nrespiratory infections.\nIntellectual disability.\nstunted growth.\n");

           System.out.println("\nTreatment :\nDry skimmed milk\nVegetable oils fed slowly\n\n");
       break;
       case 16:
    	   System.out.println("\nSTOMACH ULCERS :\nStomach Ulcers :\nSymptoms :\nRequires a medical diagnosis\nUpper abdominal pain is a common symptom.\nPeople may experience:\nPain areas:\n in the chest or upper abdomen\nPain types:\n can be dull\nGastrointestinal:\n belching, heartburn, indigestion, nausea, passing excessive amounts of gas, or vomiting\nWhole body:\n fatigue, feeling full sooner than normal, or loss of appetite\nAlso common:\n abdominal discomfort\n");

    	   System.out.println("\nTreatment :\nMedications\nAntibiotics, Proton-pump inhibitor, Penicillin antibiotic, Diarrhoea Medication, and Antacid\nMedical procedure\nTherapeutic endoscopy\n\n");
       break;
       case 17:
    	   System.out.println("\nBROCHIECTASIS :\nSymptoms :\nPeople may experience:\nPain areas:\n in the chest\nCough:\n can be chronic, with blood, or with phlegm\nRespiratory:\n shortness of breath, sinusitis, or wheezing\nWhole body:\n fatigue or inability to exercise\nAlso common:\n phlegm, recurrent infection, deformity of nails, or weight loss\n");

    	   System.out.println("\nTreatment :\nTherapies\nAirway clearance technique, Physical Therapy, and Pulmonary rehabilitation\nSupportive care\nOxygen therapy\nMedications\nBronchodilator, Steroid, Penicillin antibiotic, and Antibiotics\nPreventative\nQuitting smoking, Influenza vaccine, and Pneumococcal vaccine\n\n");
       break;
       case 18:
    	   System.out.println("\nPneumonia\nSymptoms :\nChills\nFever\nHeadache\nBreathing problem\nMuscle pain \nchest pain/breast pain \ncough\nloss of appetite\ndehydratio\n");

    	   System.out.println("\nTreatment :\nAntibiotics\nPenicillin\nOxygen therapy\noral rehydration therapy\n\n");
    	   break;
       case 19:
    	   System.out.println("\nIschaemic Heart Diesease :\nSymptoms :\nCan have no symptoms, but people may experience:\nPain areas:\n in the chest\nGastrointestinal:\n indigestion or nausea\nWhole body:\n light-headedness or sweating\nAlso common:\n fast heart rate or shortness of breath\n");

    	   System.out.println("\nTreatment :\nSelf-care\nPhysical exercise, Quitting smoking, Weight loss, and Low fat diet\nMedications\nStatin, Blood Thinners, Beta blocker, Heart Medication, and Calcium channel blocker\nMedical procedure\nCoronary stent and Angioplasty\nSurgery\nCoronary artery bypass surgery\n\n");
       break;
       case 20:
    	   System.out.println("\nCerebrovascular diesease :\nSymptoms :\nMuscular:\n difficulty walking, instability, paralysis with weak muscles, problems with coordination, stiff muscles, overactive reflexes, or paralysis of one side of the body\nVisual:\n blurred vision, double vision, sudden visual loss, or temporary loss of vision in one eye\nWhole body:\n fatigue, light-headedness, or vertigo\nSpeech:\n difficulty speaking, slurred speech, or speech loss\nSensory:\n pins and needles or reduced sensation of touch\n");

    	   System.out.println("\n Treatment :\nMedications\nAlteplase, Blood Thinners, Statin, Antihypertensive drug, and ACE inhibitor\nSupportive care\nCardiac monitoring\nSurgery\nCarotid endarterectomy\nTherapies\nSpeech therapy, Rehabilitation, Occupational Therapy, Stroke rehabilitation, and Physical Therapy\n\n");
       break;
       default :
    	   System.out.println("<-<-<-<-<-<-<-<-Wrong entry->->->->->->->->");
    	break;
             }
    if(x<21)
    {
    i=x-1;
                                                                              //a refers to Apollo Hospital
                                                                              //b AFMC hospital
                                                                              //C refers to BSRC Hospital
                                                                              //d refers to Dist. Hospital 
                                                                              //e refers to Sasoon G.H. Hospital
    //a[0],b[0],c[0],d[0],e[0] refers to Treatment cost of HIV at different hospitals 
    //a[1],b[1],c[1],d[1],e[1] refers to Treatment cost of CANCER at different hospitals 
    // a[n],b[n],c[n],d[n],e[n] refers to treatment cost of nth diesease at diffrerent hospital
    
    a[0]=0;a[1]=500000;a[2]=12000;a[3]=800000;a[4]=400;a[5]=75;a[6]=25000;a[7]=800;a[8]=40000;a[9]=12000;a[10]=5300;a[11]=1273;a[12]=4200;a[13]=110000;a[14]=21000;a[15]=525000;a[16]=1050000;a[17]=15000;a[18]=1274000;a[19]=1470000;
    b[0]=150;b[1]=700000;b[2]=17000;b[3]=900000;b[4]=500;b[5]=80;b[6]=24000;b[7]=1100;b[8]=60000;b[9]=13000;b[10]=6000;b[11]=1290;b[12]=4800;b[13]=130000;b[14]=17500;b[15]=650000;b[16]=1600000;b[17]=16000;b[18]=1600000;b[19]=1600000;
    c[0]=100;c[1]=600000;c[2]=15000;c[3]=1400000;c[4]=350;c[5]=75;c[6]=30000;c[7]=900;c[8]=55000;c[9]=13600;c[10]=5800;c[11]=1360;c[12]=4500;c[13]=120000;c[14]=15600;c[15]=600000;c[16]=1200000;c[17]=14500;c[18]=1400000;c[19]=1800000;
    d[0]=120;d[1]=1300000;d[2]=13000;d[3]=1000000;d[4]=420;d[5]=90;d[6]=40000;d[7]=850;d[8]=60000;d[9]=12500;d[10]=6200;d[11]=1450;d[12]=6500;d[13]=123000;;d[14]=18000;d[15]=620000;;d[16]=1080000;d[17]=18000;;d[18]=1350000;;d[19]=1520000;
    e[0]=0;e[1]=800000;e[2]=14000;e[3]=850000;e[4]=380;e[5]=80;e[6]=60000;e[7]=850;e[8]=45000;e[9]=15000;e[10]=5500;e[11]=1380;e[12]=5000;e[13]=132000;e[14]=19400;e[15]=625000;e[16]=1400000;e[17]=16800;e[18]=1500000;e[19]=1300000;
   System.out.println("price of treatment at Apollo,Pune = "+a[i]+" INR");
   System.out.println("price of treatment at AFMC,Pune = "+b[i]+" INR");
   System.out.println("price of treatment at BSRC,Pune = "+c[i]+" INR");
   System.out.println("price of treatment at Dist. Hospital = "+d[i]+" INR");
   System.out.println("price of treatment at Sasoon G.H.,Pune = "+e[i]+" INR");
      z[0]=a[i];
      z[1]=b[i];
      z[2]=c[i];
      z[3]=d[i];
      z[4]=e[i];                                             //SWAPING
      for(int s=0;s<5;s++)
      {
       for(int t=s+1;t<5;t++)
        {
         if(z[s]<z[t])
          {
           swap=z[s];
           z[s]=z[t];
           z[t]=swap;
          }
        }
      }
     System.out.println("\n\nlowest price among the given hospital will be = "+z[4]+"INR");                       //PRINTING LOWEST RATE OF DISEASE
    }
  }
}
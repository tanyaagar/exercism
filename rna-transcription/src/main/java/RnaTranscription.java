class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s = "";
        for(int i  = 0 ; i < dnaStrand.length() ; i++){
            char x = dnaStrand.charAt(i);
            if(x == 'G')
                s+='C';
            if(x == 'C')
                s+='G';
            if(x == 'T')
                s+='A';
            if(x == 'A')
                s+='U';
        }
        return s;
    }

}

package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes2.dex */
final class X12Encoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            encodeChar(currentChar, sb);
            if (sb.length() % 3 == 0) {
                C40Encoder.writeNextTriplet(encoderContext, sb);
                int iLookAheadTest = HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
                if (iLookAheadTest != getEncodingMode()) {
                    encoderContext.signalEncoderChange(iLookAheadTest);
                    break;
                }
            }
        }
        handleEOD(encoderContext, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public int encodeChar(char c, StringBuilder sb) {
        int i;
        char c2;
        if (c != '\r') {
            if (c == '*') {
                sb.append((char) 1);
            } else if (c == '>') {
                c2 = 2;
            } else if (c == ' ') {
                c2 = 3;
            } else {
                if (c >= '0' && c <= '9') {
                    i = c - ',';
                } else if (c < 'A' || c > 'Z') {
                    HighLevelEncoder.illegalCharacter(c);
                } else {
                    i = c - '3';
                }
                c2 = (char) i;
            }
            return 1;
        }
        c2 = 0;
        sb.append(c2);
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public void handleEOD(EncoderContext encoderContext, StringBuilder sb) {
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
        encoderContext.pos -= sb.length();
        if (encoderContext.getRemainingCharacters() > 1 || dataCapacity > 1 || encoderContext.getRemainingCharacters() != dataCapacity) {
            encoderContext.writeCodeword((char) 254);
        }
        if (encoderContext.getNewEncoding() < 0) {
            encoderContext.signalEncoderChange(0);
        }
    }
}

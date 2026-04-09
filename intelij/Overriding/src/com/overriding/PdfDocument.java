package com.overriding;
class PdfDocument extends Document {
    @Override
    void create() {
        System.out.println("Creating a PDF document");
    }
}

package com.ismael.factory.sharp;

import com.ismael.factory.matcha.Controller;
import com.ismael.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}

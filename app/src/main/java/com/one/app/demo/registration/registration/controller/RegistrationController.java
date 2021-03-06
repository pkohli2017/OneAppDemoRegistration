package com.one.app.demo.registration.registration.controller;

import com.one.app.demo.registration.base.controller.BaseController;

public interface RegistrationController extends BaseController {
    void showTermsAndConditionsFragment();

    void showYourAddressFragment();

    void showDocumentUploadFragment();

    void showCreatePasscodeFragment();

    void showDeclarationFragment();

    void showPersonalDetailsFragment();
}

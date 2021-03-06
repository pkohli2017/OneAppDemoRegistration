package com.one.app.demo.registration.registration.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.one.app.demo.registration.base.controller.BaseController;
import com.one.app.demo.registration.base.fragments.FragmentPresenter;
import com.one.app.demo.registration.registration.controller.RegistrationController;

public class DocumentUploadFragmentPresenter extends FragmentPresenter {

    private final DocumentUploadFragmentPresenterView mView;
    private final RegistrationController mController;
    private FragmentActivity mActivity;

    /**
     * @param view       view
     * @param controller controller
     */
    private DocumentUploadFragmentPresenter(DocumentUploadFragmentPresenterView view,
                                                RegistrationController controller) {
        mView = view;
        mController = controller;
    }

    /**
     * @param view       view
     * @param controller controller
     * @return instance
     */
    public static DocumentUploadFragmentPresenter newInstance(DocumentUploadFragmentPresenterView view,
                                                                  RegistrationController controller) {
        return new DocumentUploadFragmentPresenter(view, controller);
    }

    @Override
    protected void onAttach(Activity activity) {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mActivity = getActivity();
    }

    @Override
    public void onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    }

    @Override
    protected void onActivityCreated(Bundle savedInstanceState) {
    }

    @Override
    protected void onResume() {
    }

    @Override
    protected void onPause() {
    }

    @Override
    protected void onDestroy() {
    }

    @Override
    public FragmentActivity getActivity() {
        return mView.getActivity();
    }

    @Override
    public void showProgressDialog(BaseController controller) {
        super.showProgressDialog(controller);
    }

    @Override
    public void hideProgressDialog(BaseController controller) {
        super.hideProgressDialog(controller);
    }

    @Override
    public void showActionBar(BaseController controller) {
        super.showActionBar(controller);
    }

    @Override
    public void hideActionBar(BaseController controller) {
        super.hideActionBar(controller);
    }

    public interface DocumentUploadFragmentPresenterView {

        FragmentActivity getActivity();
    }
}


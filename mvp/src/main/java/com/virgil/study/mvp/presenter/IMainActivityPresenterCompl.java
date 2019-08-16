package com.virgil.study.mvp.presenter;

public class IMainActivityPresenterCompl implements IMainActivityPresenter {

    private IMainActivityPresenterView presenterView;

    public IMainActivityPresenterCompl(IMainActivityPresenterView presenterView) {
        this.presenterView = presenterView;
    }

    @Override
    public void setText(String text) {
        presenterView.setText(text);
    }
}

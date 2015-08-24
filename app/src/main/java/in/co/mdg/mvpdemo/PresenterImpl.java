package in.co.mdg.mvpdemo;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 21-Aug-15
 */
public class PresenterImpl implements Presenter, OnRequestFinishedListener {

    MainView mainView;
    Interactor interactor;

    public PresenterImpl(MainView mainView) {
        this.mainView = mainView;
        this.interactor = new InteractorImpl();
    }

    @Override
    public void fetchData() {
        mainView.showProgressbar();
        interactor.fetchData(this);
    }

    @Override
    public void onSuccess() {
        mainView.hideProgressbar();
        mainView.setSuccessLayout();
    }

    @Override
    public void onError() {
        mainView.hideProgressbar();
        mainView.setErrorLayout();
    }
}

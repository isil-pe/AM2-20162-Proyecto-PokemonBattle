package am2.fbueno.project.pokemonbattle.view;

import java.util.List;

import am2.fbueno.project.pokemonbattle.domain.UserDetailPresenter;
import am2.fbueno.project.pokemonbattle.entity.BattleDetail;
import am2.fbueno.project.pokemonbattle.view.base.View;

/**
 * Created by FBueno on 11/18/2016.
 */

public abstract class UserDetailView extends View {
    private StatusDetailPartialView statusPartialView;
    private ShowDetailPartialView showPartialView;

    private UserDetailPresenter userDetailPresenter;

    public void setUserDetailPresenter(UserDetailPresenter userDetailPresenter) {
        this.userDetailPresenter = userDetailPresenter;
    }

    public void attachViews(StatusDetailPartialView statusDetailPartialView, ShowDetailPartialView showDetailPartialView){
        statusPartialView = statusDetailPartialView;
        showPartialView = showDetailPartialView;
    }

    public UserDetailPresenter getUserDetailPresenter() {
        return userDetailPresenter;
    }

    public void showVictoriesCount(int value){
        statusPartialView.setVictories(value);
    }

    public void showLossesCount(int value){
        statusPartialView.setLoses(value);
    }

    public void showBattlesCount(int value){
        statusPartialView.setBattles(value);
    }

    public void showBattlesDetail(List<BattleDetail> details) {
        showPartialView.setBattlesDetail(details);
    }
}

package lotto.controller;

import lotto.model.Lotto;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    public static void run() {
        InputView.inputMoney();
        OutputView.printAmountOfLottoTickets();
        List<Lotto> lottoTickets = new ArrayList<>();
        lottoTickets = LottoService.makeLottoTickets();
        OutputView.printLottoTickets(lottoTickets);
        InputView.inputWinningNumbers();
        InputView.inputBonusNumber();
    }
}
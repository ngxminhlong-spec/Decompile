package G2;

import V2.g;
import Y2.m;
import android.animation.ValueAnimator;
import b0.C0196i;
import b0.C0202o;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ProgrammableArrayView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramView;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f766b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f765a = i4;
        this.f766b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f765a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.f766b).f12303h;
                if (gVar != null) {
                    V2.f fVar = gVar.f1880o;
                    if (fVar.f1860i != floatValue) {
                        fVar.f1860i = floatValue;
                        gVar.f1884s = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((m) this.f766b).c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((TextInputLayout) this.f766b).f12489R0.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0196i c0196i = (C0196i) this.f766b;
                c0196i.c.setAlpha(floatValue2);
                c0196i.d.setAlpha(floatValue2);
                c0196i.f3317s.invalidate();
                return;
            case 4:
                ((C0202o) this.f766b).f3371m = valueAnimator.getAnimatedFraction();
                return;
            case 5:
                ProgrammableArrayView programmableArrayView = (ProgrammableArrayView) this.f766b;
                if (!programmableArrayView.f3695r.isFinished()) {
                    programmableArrayView.f3695r.computeScrollOffset();
                }
                programmableArrayView.scrollTo(programmableArrayView.f3695r.getCurrX(), programmableArrayView.f3695r.getCurrY());
                return;
            case 6:
                TimeDiagramView timeDiagramView = (TimeDiagramView) this.f766b;
                if (!timeDiagramView.f3754r.isFinished()) {
                    timeDiagramView.f3754r.computeScrollOffset();
                }
                timeDiagramView.scrollTo(timeDiagramView.f3754r.getCurrX(), timeDiagramView.f3754r.getCurrY());
                return;
            default:
                BoardView boardView = (BoardView) this.f766b;
                if (!boardView.f3826t.isFinished()) {
                    boardView.f3826t.computeScrollOffset();
                }
                boardView.scrollTo(boardView.f3826t.getCurrX(), boardView.f3826t.getCurrY());
                return;
        }
    }
}

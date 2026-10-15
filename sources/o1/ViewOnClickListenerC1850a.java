package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import e1.C1660a;
import h1.AbstractC1698a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1850a implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14245o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CircuitExploreDialog f14246p;

    public /* synthetic */ ViewOnClickListenerC1850a(CircuitExploreDialog circuitExploreDialog, int i4) {
        this.f14245o = i4;
        this.f14246p = circuitExploreDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14245o) {
            case 0:
                this.f14246p.b();
                return;
            default:
                int i4 = 0;
                while (true) {
                    CircuitExploreDialog circuitExploreDialog = this.f14246p;
                    if (i4 >= circuitExploreDialog.getChildCount()) {
                        return;
                    }
                    View childAt = circuitExploreDialog.getChildAt(i4);
                    if ((childAt instanceof BoardView) && childAt.getVisibility() == 0) {
                        BoardView boardView = (BoardView) childAt;
                        AbstractC1698a selectedElement = boardView.getSelectedElement();
                        if (selectedElement instanceof e1.d) {
                            P0.a aVar = (P0.a) selectedElement.d(0L);
                            ((C1660a) boardView.f3821o.f14886u).clear();
                            circuitExploreDialog.a(aVar, circuitExploreDialog.f3589s);
                        }
                    }
                    i4++;
                }
                break;
        }
    }
}

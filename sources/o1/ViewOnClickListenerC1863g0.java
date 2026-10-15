package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1863g0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14263o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TutorialView f14264p;

    public /* synthetic */ ViewOnClickListenerC1863g0(TutorialView tutorialView, int i4) {
        this.f14263o = i4;
        this.f14264p = tutorialView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14263o;
        TutorialView tutorialView = this.f14264p;
        switch (i4) {
            case 0:
                int i5 = tutorialView.f3776r;
                tutorialView.getClass();
                throw null;
            default:
                int i6 = tutorialView.f3776r;
                if (i6 == 0) {
                    return;
                }
                tutorialView.f3776r = i6 - 1;
                WeakHashMap weakHashMap = H.A.f779a;
                if (tutorialView.getLayoutDirection() == 0) {
                    tutorialView.getClass();
                    throw null;
                }
                tutorialView.getClass();
                throw null;
        }
    }
}

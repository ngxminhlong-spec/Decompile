package N2;

import H.G;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1228a;

    /* renamed from: b, reason: collision with root package name */
    public int f1229b;
    public final View c;

    public b(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.f1228a = false;
    }

    public b(FloatingActionButton floatingActionButton) {
        this.f1228a = false;
        this.f1229b = 0;
        this.c = floatingActionButton;
    }

    @Override // H.G
    public void a() {
        if (this.f1228a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f2500t = null;
        ActionBarContextView.b(actionBarContextView, this.f1229b);
    }

    @Override // H.G
    public void b() {
        this.f1228a = true;
    }

    @Override // H.G
    public void c() {
        ActionBarContextView.a((ActionBarContextView) this.c);
        this.f1228a = false;
    }
}

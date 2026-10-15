package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758b0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13719o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f13720p;

    public /* synthetic */ C1758b0(int i4, Object obj) {
        this.f13719o = i4;
        this.f13720p = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        V v4;
        switch (this.f13719o) {
            case 0:
                if (i4 == -1 || (v4 = ((C1764e0) this.f13720p).f13743q) == null) {
                    return;
                }
                v4.setListSelectionHidden(false);
                return;
            default:
                ((SearchView) this.f13720p).o(i4);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f13719o;
    }
}

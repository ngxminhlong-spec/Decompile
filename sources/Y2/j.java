package Y2;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f2167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2167e = mVar;
    }

    @Override // Y2.u, H.C0027b
    public final void d(View view, I.g gVar) {
        super.d(view, gVar);
        if (this.f2167e.f2184a.getEditText().getKeyListener() == null) {
            gVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? gVar.f918a.isShowingHintText() : gVar.e(4)) {
            gVar.k(null);
        }
    }

    @Override // H.C0027b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        m mVar = this.f2167e;
        AutoCompleteTextView d = m.d(mVar, mVar.f2184a.getEditText());
        if (accessibilityEvent.getEventType() == 1 && mVar.f2181n.isTouchExplorationEnabled()) {
            m.e(mVar, d);
        }
    }
}

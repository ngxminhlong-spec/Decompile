package C0;

import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n0 implements TextWatcher {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f351o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1510e1 f352p;

    public n0(View view, C1510e1 c1510e1) {
        this.f351o = view;
        this.f352p = c1510e1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f351o.setVisibility(0);
        l1.f fVar = l1.f.f13951e;
        String obj = editable.toString();
        fVar.getClass();
        l1.e eVar = new l1.e(fVar, obj, this.f352p);
        if (fVar.d != null) {
            fVar.c = eVar;
        } else {
            fVar.d = eVar;
            eVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}

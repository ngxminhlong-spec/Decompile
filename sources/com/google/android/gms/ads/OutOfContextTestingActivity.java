package com.google.android.gms.ads;

import O1.C0055c;
import O1.C0077n;
import O1.C0081p;
import O1.InterfaceC0078n0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.BinderC0983o9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0077n c0077n = C0081p.f1374f.f1376b;
        BinderC0983o9 binderC0983o9 = new BinderC0983o9();
        c0077n.getClass();
        InterfaceC0078n0 interfaceC0078n0 = (InterfaceC0078n0) new C0055c(this, binderC0983o9).d(this, false);
        if (interfaceC0078n0 == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            interfaceC0078n0.p2(stringExtra, new BinderC1813b(this), new BinderC1813b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

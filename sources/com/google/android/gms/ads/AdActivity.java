package com.google.android.gms.ads;

import O1.C0053b;
import O1.C0077n;
import O1.C0081p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC1204ta;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1204ta f3851o;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.j2(i4, i5, intent);
            }
        } catch (Exception e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                if (!interfaceC1204ta.G2()) {
                    return;
                }
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        super.onBackPressed();
        try {
            InterfaceC1204ta interfaceC1204ta2 = this.f3851o;
            if (interfaceC1204ta2 != null) {
                interfaceC1204ta2.g();
            }
        } catch (RemoteException e5) {
            Y9.u("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.X1(new BinderC1813b(configuration));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0077n c0077n = C0081p.f1374f.f1376b;
        c0077n.getClass();
        C0053b c0053b = new C0053b(c0077n, this);
        Intent intent = getIntent();
        boolean z4 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z4 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            Y9.p("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC1204ta interfaceC1204ta = (InterfaceC1204ta) c0053b.d(this, z4);
        this.f3851o = interfaceC1204ta;
        if (interfaceC1204ta == null) {
            Y9.u("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC1204ta.C0(bundle);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.q();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.n();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.e3(i4, strArr, iArr);
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.p();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.M();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.c1(bundle);
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.x();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.s();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC1204ta interfaceC1204ta = this.f3851o;
            if (interfaceC1204ta != null) {
                interfaceC1204ta.b();
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        super.setContentView(i4);
        InterfaceC1204ta interfaceC1204ta = this.f3851o;
        if (interfaceC1204ta != null) {
            try {
                interfaceC1204ta.w();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC1204ta interfaceC1204ta = this.f3851o;
        if (interfaceC1204ta != null) {
            try {
                interfaceC1204ta.w();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC1204ta interfaceC1204ta = this.f3851o;
        if (interfaceC1204ta != null) {
            try {
                interfaceC1204ta.w();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }
}

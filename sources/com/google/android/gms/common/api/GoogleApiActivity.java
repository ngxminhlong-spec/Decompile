package com.google.android.gms.common.api;

import U.a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.Ur;
import e2.C1664b;
import e2.e;
import g2.C1684d;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f3891p = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3892o = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f3892o = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C1684d e4 = C1684d.e(this);
                if (i5 == -1) {
                    Ur ur = e4.f12989A;
                    ur.sendMessage(ur.obtainMessage(3));
                } else if (i5 == 0) {
                    e4.f(new C1664b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f3892o = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f3892o = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3892o = bundle.getInt("resolution");
        }
        if (this.f3892o == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            y.i(num);
            e.d.d(this, num.intValue(), this);
            this.f3892o = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f3892o = 1;
            } catch (ActivityNotFoundException e4) {
                e = e4;
                if (extras.getBoolean("notify_manager", true)) {
                    C1684d.e(this).f(new C1664b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String k3 = a.k("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        k3 = k3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", k3, e);
                }
                googleApiActivity.f3892o = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e6) {
            e = e6;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f3892o);
        super.onSaveInstanceState(bundle);
    }
}

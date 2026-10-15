package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC1629o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: o, reason: collision with root package name */
    public ResultReceiver f3558o;

    /* renamed from: p, reason: collision with root package name */
    public ResultReceiver f3559p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3560q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3561r;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i4;
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC1629o.d("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3560q = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f3558o = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3559p = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3561r = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        AbstractC1629o.d("ProxyBillingActivity", "Launching Play Store billing flow");
        int i5 = 100;
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f3561r = true;
                    i5 = 110;
                }
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f3558o = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else {
                if (!getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    i4 = 100;
                    pendingIntent = null;
                    this.f3560q = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i4, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f3559p = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i5 = 101;
            }
            this.f3560q = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i4, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e4) {
            AbstractC1629o.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e4);
            ResultReceiver resultReceiver = this.f3558o;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f3559p;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a4 = a();
                    if (this.f3561r) {
                        a4.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a4.putExtra("RESPONSE_CODE", 6);
                    a4.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a4);
                }
            }
            this.f3560q = false;
            finish();
            return;
        }
        i4 = i5;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f3560q) {
            Intent a4 = a();
            a4.putExtra("RESPONSE_CODE", 1);
            a4.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a4);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3558o;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3559p;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3560q);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3561r);
    }
}

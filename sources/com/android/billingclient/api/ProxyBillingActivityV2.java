package com.android.billingclient.api;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.b;
import androidx.activity.d;
import androidx.activity.result.c;
import androidx.activity.result.g;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import java.util.concurrent.atomic.AtomicInteger;
import v3.C2033d;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends d {

    /* renamed from: w, reason: collision with root package name */
    public c f3562w;

    /* renamed from: x, reason: collision with root package name */
    public c f3563x;
    public ResultReceiver y;

    /* renamed from: z, reason: collision with root package name */
    public ResultReceiver f3564z;

    @Override // androidx.activity.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2033d c2033d = new C2033d(18);
        D3.d dVar = new D3.d(2, this);
        StringBuilder sb = new StringBuilder("activity_rq#");
        AtomicInteger atomicInteger = this.f2419u;
        sb.append(atomicInteger.getAndIncrement());
        String sb2 = sb.toString();
        b bVar = this.f2420v;
        this.f3562w = bVar.b(sb2, this, c2033d, dVar);
        this.f3563x = bVar.b("activity_rq#" + atomicInteger.getAndIncrement(), this, new C2033d(18), new f(1, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.y = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f3564z = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC1629o.d("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.y = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f3562w.d(new g(pendingIntent.getIntentSender()));
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f3564z = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f3563x.d(new g(pendingIntent2.getIntentSender()));
        }
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.y;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3564z;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
